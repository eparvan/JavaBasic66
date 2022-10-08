package JavaBasic66;

import java.util.Scanner;

/*
* 27. Write a Java program to convert a octal number to a hexadecimal number.
* */
public class Problema27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul octal = ");
        Integer numOctal = Integer.parseInt(input.nextLine(),8);
        System.out.println("In HexaZecimal = " + Integer.toHexString(numOctal).toUpperCase());
    }
}
