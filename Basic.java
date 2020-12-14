package chapter2;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        int FirstNumber ;
        int SecondNumber ;
        int sum,product,mode,quotient;
    Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstInput: ");
        FirstNumber= input.nextInt();

        System.out.print("Enter your secondInput: ");
        SecondNumber= input.nextInt();
        sum = FirstNumber + SecondNumber;
        product = FirstNumber * SecondNumber;
        mode = FirstNumber % SecondNumber;
        quotient = FirstNumber % SecondNumber;

        System.out.printf("Sum is %d%n",sum);
        System.out.printf("product is %d%n",product);
        System.out.printf("mode is %d%n",mode);
        System.out.printf("quotient is %d%n",quotient);

    }
}
