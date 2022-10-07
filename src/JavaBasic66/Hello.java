package JavaBasic66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introdu numele: ");
        String nume=input.readLine();
        System.out.println("Hello \n"+ nume);
    }
}
