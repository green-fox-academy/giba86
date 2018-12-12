package com.example.loginrepo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

  UserRepository repository = UserRepository.getInstance();

  @GetMapping("/register")
  public String home() {
    return "register";
  }

  @PostMapping("/register")
  public String register(@RequestParam String username, @RequestParam String password) {
    repository.add(new User(username, password));
    return "redirect:/login";
  }

  @GetMapping("/secure")
  public String success(@RequestParam("u") String username, Model model) {
    model.addAttribute("username", username);
    return "secure";
  }

  @GetMapping("/error")
  public String error() {
    return "error";
  }
}
