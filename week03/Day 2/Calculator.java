import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        List<String> operators = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
        String operator;
        System.out.println("Enter the \"operation\" you want to use it can be "+operators+ ": ");
        Scanner input = new Scanner(System.in);

        while(true){
            operator = input.nextLine();
            if(operators.contains(operator)){
                System.out.println("The chosen operator is: "+operator);
                break;
            }else{
                System.out.println("Please choose from the following options: "+operators);
            }
        }
        System.out.println("Enter the first number: ");
        Scanner numbers = new Scanner(System.in);
        double num1 = numbers.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = numbers.nextDouble();
        System.out.println("The two numbers are: " +num1+ " and " +num2);

        System.out.println("The outcome is: "+calculate(operator, num1, num2));

    } public static Double calculate(String op, double n1, double n2){
        double value = 0;
        if(op.equals("+")){
            value = n1 + n2;
        }else if(op.equals("-")){
            value = n1 - n2;
        }else if(op.equals("*")){
            value = n1 * n2;
        }else if(op.equals("/")){
            value = n1 / n2;
        }else if(op.equals("%")){
            value = n1 % n2;
        }
        return value;
    }
}
// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit