package com.example.h2.todos;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ToDoController {

  @RequestMapping("/")
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }
}
