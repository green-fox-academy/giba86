package com.example.coloringaround.coloring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ColorController {

  @Autowired
  @Qualifier("redColor")
  MyColor red;

  @Autowired
  @Qualifier("blueColor")
  MyColor blue;


  @RequestMapping("/")
  @ResponseBody
  public void myColorMate() {
    blue.printColor();
    //red.printColor();
  }
}
