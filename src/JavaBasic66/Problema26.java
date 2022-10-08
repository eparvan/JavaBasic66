package JavaBasic66;

import java.util.Scanner;

/*
* 26. Write a Java program to convert a octal number to a binary number.
* */
public class Problema26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul octal = ");
        Integer numOctal = Integer.parseInt(input.nextLine(),8);
        System.out.println("In zecimal = " + Integer.toBinaryString(numOctal));
    }
}
