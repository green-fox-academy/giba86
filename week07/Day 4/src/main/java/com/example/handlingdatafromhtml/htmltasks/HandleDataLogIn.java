package com.example.handlingdatafromhtml.htmltasks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HandleDataLogIn {

  @RequestMapping("/login/data")
  public String login(@RequestParam String name, @RequestParam String password) {
    return name + " " + password;
  }


//  protected void doPost(HttpServletRequest request,
//                        HttpServletResponse response) throws ServletException, IOException {
//
//    String userName = request.getParameter("user_name");
//    String password = request.getParameter("user_passwrd");
//
//    PrintWriter writeMsg = response.getWriter();
//
//    System.out.println("usernam:" + userName + "\npassword: " + password);
//
//
//  }

}
