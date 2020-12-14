package chapter2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        double x;
        double y;
        double z;
        double result;

        System.out.println("Enter first integer");
        x = userInput.nextInt();

        System.out.println("Enter second integer");
        y = userInput.nextInt();

        System.out.println("Enter third integer");
        z = userInput.nextInt();


        result = x * y * z;

        System.out.printf("Product is %f", result);
//        System.out.printf("result is %d%n",);







    }




}
