package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "hello";
  }

  @ResponseBody
  @RequestMapping("/hellobello")
  public String hello() {
    return "Hello-Bello";
  }

  @ResponseBody
  @RequestMapping("/seadog")
  public String seadog() {
    return "Hello seadog";
  }


}
