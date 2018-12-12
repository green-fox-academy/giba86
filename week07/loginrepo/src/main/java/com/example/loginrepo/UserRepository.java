package com.example.loginrepo;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  private List<User> users;
  private static UserRepository instance;

  private UserRepository() {
    this.users = new ArrayList<>();
  }

  public static UserRepository getInstance() {
    if (instance == null) {
      instance = new UserRepository();
    }
    return instance;
  }

  public void add(User user) {
    if (user != null) {
      users.add(user);
    }
  }

  public List<User> getUsers() {
    return users;
  }

  public boolean verify(String username, String password) {
    return users.stream().anyMatch(u ->
            u.getUsername().equals(username) &&
                    u.getPassword().equals(password)
    );
//    for (int i = 0; i < users.size(); i++) {
//      User u = users.get(i);
//      if (username.equals(u.getUsername()) &&
//          password.equals(u.getPassword())) {
//        return true;
//      }
//    }
//    return false;
  }
}
