package week10.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public String greeter(@RequestParam (value ="click", required = false) String name),
  @RequestParam (value ="click", required = false) String name)
}
