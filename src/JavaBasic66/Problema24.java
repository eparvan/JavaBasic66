package JavaBasic66;

import java.util.Scanner;

/*
* 24. Write a Java program to convert a binary number to a Octal number.
* */
public class Problema24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul binar = ");
        String numBinar = input.nextLine();
        int numZecimal = Integer.parseInt(numBinar, 2);
        System.out.println("In Octal = " + Integer.toOctalString(numZecimal));
    }
}
