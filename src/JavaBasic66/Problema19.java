package JavaBasic66;

import java.util.Scanner;

/*
 * 19. Write a Java program to convert a decimal number to binary number.
 * */
public class Problema19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul zecimal = ");
        int numZecimal = input.nextInt();
        System.out.println("In binar = " + Integer.toBinaryString(numZecimal));
    }
}
