package com.example.handlingdatafromhtml.htmltasks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

  @RequestMapping("/login")
  public String logIn() {
    return "loginServlet";
  }
}
