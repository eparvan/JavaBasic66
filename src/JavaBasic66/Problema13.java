package JavaBasic66;

import java.io.IOException;
import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Lungime: ");
        int lungime = input.nextInt();
        System.out.print("latime: ");
        int latime = input.nextInt();
        double perimetru = (lungime + latime) * 2;
        double aria = lungime * latime;
        System.out.println("Perimetru: " + perimetru);
        System.out.println("Aria: " + aria);
    }
}
