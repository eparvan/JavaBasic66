package JavaBasic66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problema17 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Numarul binar1 = ");
        String numar1 = input.nextLine();
        System.out.print("Numarul binar2 = ");
        String numar2 = input.nextLine();
        Integer numarBinar1=Integer.parseInt(numar1,2);
        Integer numarBinar2=Integer.parseInt(numar2,2);
        Integer suma=numarBinar1+numarBinar2;
        System.out.println("Suma: "+Integer.toBinaryString(suma));
    }
}
