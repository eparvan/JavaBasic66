package JavaBasic66;

import java.io.IOException;
import java.util.Scanner;

public class ProductTwoNumbers {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1=input.nextInt();
        System.out.print("Numar 2: ");
        int num2=input.nextInt();
        int prod = num1*num2;
        System.out.println(num1 +" * "+ num2+" = "+prod);
    }
}
