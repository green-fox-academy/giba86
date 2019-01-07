package week10.rest.Models;

public class Doubling {

  private Double received;
  private Double result;

  public Doubling() {
  }

  public Doubling(Double received) {
    this.received = received;
    this.result = received * 2;
  }

  public Double getReceived() {
    return received;
  }

  public void setReceived(Double received) {
    this.received = received;
  }

  public Double getResult() {
    return result;
  }

  public void setResult(Double result) {
    this.result = result;
  }
}
