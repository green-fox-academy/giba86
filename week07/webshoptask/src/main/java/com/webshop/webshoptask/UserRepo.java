package com.webshop.webshoptask;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
  private List<User> users;
  private static UserRepo instance;

  private UserRepo(){
    this.users = new ArrayList<>();
  }

  public static UserRepo getInstance() {
    if (instance == null) {
      instance = new UserRepo();
    }
    return instance;
  }

  public boolean verify(String username, String password) {
    return users
            .stream()
            .anyMatch(u -> u.getUsername().equals(username) &&
                    u.getPassword().equals(password));
  }
}
