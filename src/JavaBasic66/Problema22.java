package JavaBasic66;

import java.util.Scanner;

/*
 * 22. Write a Java program to convert a binary number to decimal number.
 * */
public class Problema22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul binar = ");
        String numBinar = input.nextLine();
        System.out.println("In zecimal = " + Integer.parseInt(numBinar,2));
    }
}
