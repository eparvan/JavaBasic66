package JavaBasic66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Write a Java program to print the sum of two numbers.
 * */
public class SumTwoNumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1 = input.nextInt();
        System.out.print("Numar 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
