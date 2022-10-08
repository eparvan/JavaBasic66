package JavaBasic66;

import java.util.Scanner;

/*
* 25. Write a Java program to convert a octal number to a decimal number.
* */
public class Problema25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numarul octal = ");
        String numOctal = input.nextLine();
        int numZecimal = Integer.parseInt(numOctal, 8);
        System.out.println("In zecimal = " + numZecimal);
    }
}
