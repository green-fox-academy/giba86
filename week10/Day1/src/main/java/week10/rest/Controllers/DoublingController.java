package week10.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import week10.rest.Models.Doubling;


@RestController
public class DoublingController {



  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Double input) throws Exception {
    if (input != null) {
      return new Doubling(input);
    } else {
      throw new UnsupportedOperationException("Please provide an input!");
    }
  }
}
