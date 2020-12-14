package chapter2;
import java.util.Scanner;

public class Comparison2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.println("Enter the firstNumber");
        firstNumber = userInput.nextInt();

        System.out.println("Enter the secondNumber");
        secondNumber = userInput.nextInt();

        sum = firstNumber + secondNumber;
        System.out.printf("sum is %d%n", sum);

        product = firstNumber * secondNumber;
        System.out.printf("product is %d%n", product);

        difference = firstNumber % secondNumber;
        System.out.printf("difference is %d%n", difference);

        quotient = firstNumber / secondNumber;
        System.out.printf("qoutient is %d%n", quotient);


    }





}
