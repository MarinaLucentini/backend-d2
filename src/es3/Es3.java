package es3;

import java.util.Objects;
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi una frase");
        String text = sc.nextLine();


        while (!Objects.equals(text, ":q")) {


            String[] testo = text.split("");
            for (int i = 0; i < testo.length; i++) {
                System.out.println(testo[i] + ",");
            }
            System.out.println("Scrivi una frase");
            text = sc.nextLine();
        }


    }
}
