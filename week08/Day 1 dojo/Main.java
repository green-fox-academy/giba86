public class Main {
  public static void main(String[] args) {
  }

  public static double getPrice(int fromBook1, int fromBook2, int fromBook3, int fromBook4, int fromBook5) {

    int maxAmount = 0;
    int counter = 1;
    int discountbooks = 0;
    double price = 0;
    double discount;
    int[] shopers = new int[5];
    shopers[0] = fromBook1;
    shopers[1] = fromBook2;
    shopers[2] = fromBook3;
    shopers[3] = fromBook4;
    shopers[4] = fromBook5;

    for (int i = 0; i < shopers.length; i++) {
      if (maxAmount < shopers[i]) {
        maxAmount = shopers[i];
      }
    }

    for (int i = 0; i < maxAmount; i++) {
      for (int j = 0; j < shopers.length; j++) {
        if (shopers[j] >= counter) {
          discountbooks++;
        }
      }
      if (discountbooks == 2) {
        discount = 0.05;
      } else if (discountbooks == 3) {
        discount = 0.1;
      } else if (discountbooks == 4) {
        discount = 0.2;
      } else if (discountbooks == 5) {
        discount = 0.25;
      } else {
        discount = 0;
      }
      price += (discountbooks * 8 * (1 - discount));
      discountbooks = 0;

      for (int j = 0; j < shopers.length; j++) {
        shopers[j]--;
      }
    }
    return price;
  }
}

