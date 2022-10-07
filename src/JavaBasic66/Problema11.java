package JavaBasic66;

import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("raza: ");
        double raza= input.nextDouble();
        double arieCerc=Math.PI*Math.pow(raza,2);
        double lungimeCerc = 2*Math.PI*raza;
        System.out.println("Lungimea cercului: "+ lungimeCerc);
        System.out.println("Aria cercului: "+ arieCerc);
    }
}
