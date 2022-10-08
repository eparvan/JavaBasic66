package JavaBasic66;

import java.util.Scanner;

/*
 * 23. Write a Java program to convert a binary number to hexadecimal number.
 * */
public class Problema23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul binar = ");
        String numBinar = input.nextLine();
        int numZecimal = Integer.parseInt(numBinar,2);
        System.out.println("In Hexazecimal = " + Integer.toHexString(numZecimal).toUpperCase());
    }
}
