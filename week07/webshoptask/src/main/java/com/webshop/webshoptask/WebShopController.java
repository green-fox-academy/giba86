package com.webshop.webshoptask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebShopController {

  private ProductList productList = new ProductList();
  private UserRepo userList = UserRepo.getInstance();

  @RequestMapping("/")
  public String root() {
    return "LogInForm";
  }

  @PostMapping("/")
  public String verify(@RequestParam String username, @RequestParam String password) {
    if (userList.verify(username, password)) {
      return "redirect:/secure>u=" + username;
    }
    return "redirect:/error";
  }

  @RequestMapping("/webshop")
  public String webShop(Model model) {
    model.addAttribute("productList", productList.getProductList());
    return "webShopMain";
  }

  @RequestMapping("/webshop/onlyavailable")
  public String onlyAvailable(Model model) {
    model.addAttribute("productList", productList.availableStock());
    return "webShopMain";
  }

  @RequestMapping("/webshop/cheapestfirst")
  public String cheapestFirst(Model model) {
    model.addAttribute("productList", productList.cheapestFirst());
    return "webShopMain";
  }

  @RequestMapping("/webshop/containsnike")
  public String containsNike(Model model) {
    model.addAttribute("productList", productList.containsNike());
    return "webShopMain";
  }

  @RequestMapping("/webshop/averagestock")
  public String averageStock(Model model) {
    model.addAttribute("average", productList.averageStock());
    return "averageStock";
  }

  @RequestMapping("/webshop/mostexpensive")
  public String mostExpensive(Model model) {
    model.addAttribute("average", productList.theMostExpensive());
    return "averageStock";
  }

  @RequestMapping("/webshop/search")
  public String searchBar(Model model, @RequestParam String search) {
    model.addAttribute("productList", productList.searchBari(search));
    return "webShopMain";
  }
}
