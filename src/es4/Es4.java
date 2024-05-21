package es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero : ");

        int num = Integer.parseInt(sc.nextLine());

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
