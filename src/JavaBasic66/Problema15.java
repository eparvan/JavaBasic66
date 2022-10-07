package JavaBasic66;

import java.io.IOException;
import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1=input.nextInt();
        System.out.print("Numar 2: ");
        int num2=input.nextInt();
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }
}
