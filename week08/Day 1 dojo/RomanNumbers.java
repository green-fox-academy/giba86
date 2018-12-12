public class RomanNumbers {
  public static void main(String[] args) {

  }

  public static String convertRoman(int num) {
    String roman = "";
    if (num < 10) {
      if (num < 4) {
        for (int i = 0; i < num; i++) {
          roman += "I";
        }
        return roman;
      } else if (num == 4) {
        return "IV";
      } else if (num == 5) {
        return "V";
      } else if (num > 5 && num < 9) {
        roman = "V";
        for (int i = 0; i < (num % 5); i++) {
          roman += "I";
        }
        return roman;
      } else if (num == 9) {
        return "IX";
      }
    } else if (num < 50) {
      if (num < 54) {
        for (int i = 50; i < num; i++) {
          roman += "I";
        }
        return roman;
      } else if (num == 4) {
        return "IV";
      } else if (num == 5) {
        return "V";
      } else if (num > 5 && num < 9) {
        roman = "V";
        for (int i = 0; i < (num % 5); i++) {
          roman += "I";
        }
        return roman;
      } else if (num == 9) {
        return "IX";
      }
    } else if (num % 5 == 1){
      roman +=


  }
}
