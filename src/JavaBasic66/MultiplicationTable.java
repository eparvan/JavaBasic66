package JavaBasic66;


/*
*Write a Java program that takes a number as input and prints its multiplication table upto 10
* */

import java.io.IOException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1=input.nextInt();
        int prod=1;
        for (int i=1; i<=10; i++){
            prod=num1*i;
            System.out.println(num1 +" * "+ i+" = "+prod);
        }
    }
}
