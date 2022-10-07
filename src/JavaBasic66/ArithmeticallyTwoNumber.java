package JavaBasic66;

import java.io.IOException;
import java.util.Scanner;
/*
* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
* */
public class ArithmeticallyTwoNumber {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1 = input.nextInt();
        System.out.print("Numar 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        int dif = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + dif);
        int prod = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + prod);
        int divide = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + divide);
        int rest = num1 % num2;
        System.out.println(num1 + " mod " + num2 + " = " + rest);
    }
}
