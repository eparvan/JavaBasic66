package JavaBasic66;

import java.io.IOException;
import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar 1: ");
        int num1 = input.nextInt();
        System.out.print("Numar 2: ");
        int num2 = input.nextInt();
        double media = (num1 + num2) / 2;
        System.out.println("Media: " + media);
    }
}
