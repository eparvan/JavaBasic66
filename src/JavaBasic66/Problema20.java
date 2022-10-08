package JavaBasic66;

import java.util.Scanner;

/*
 * 20. Write a Java program to convert a decimal number to hexadecimal number.
 * */
public class Problema20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul zecimal = ");
        int numZecimal = input.nextInt();
        System.out.println("In Hexazecimal = " + Integer.toHexString(numZecimal).toUpperCase());
    }
}

