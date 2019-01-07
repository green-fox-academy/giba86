package week10.rest.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import week10.rest.Models.RestError;

@ControllerAdvice
public class HandlingError {

  @ResponseBody
  @ExceptionHandler(UnsupportedOperationException.class)
  @ResponseStatus(HttpStatus.OK)
  RestError HandlingError(UnsupportedOperationException ex) {
    return new RestError(ex.getMessage());
  }

}
