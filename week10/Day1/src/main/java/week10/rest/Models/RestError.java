package week10.rest.Models;


public class RestError {

  private String error;

  public RestError(String error) {
    this.error = error;
  }

  public RestError() {
  }

  public String getError() {
    return error;
  }
}
