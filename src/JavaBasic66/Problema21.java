package JavaBasic66;

import java.util.Scanner;

/*
 * 21. Write a Java program to convert a decimal number to octal number.
 * */
public class Problema21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul zecimal = ");
        int numZecimal = input.nextInt();
        System.out.println("In Octal = " + Integer.toOctalString(numZecimal));
    }
}
