package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestControllerForObjects {


  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(name);
  }

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    Greeting greeting = new Greeting(name);
    model.addAttribute("hello", greeting.getHellos());
    model.addAttribute("name", name);
    model.addAttribute("counter", greeting.getId());
    model.addAttribute("colour", new Colour().toString());
    model.addAttribute("font", ((int)(Math.random() * 70 + 10)));
    return "greeting";
  }
}
