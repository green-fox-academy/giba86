package com.example.loginrepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  UserRepository repository = UserRepository.getInstance();

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String verify(@RequestParam String username, @RequestParam String password) {
    if (repository.verify(username, password)) {
      return "redirect:/secure?u=" + username;
    }
    return "redirect:/error";
  }
}
