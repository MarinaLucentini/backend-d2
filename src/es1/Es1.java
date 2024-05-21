package es1;

public class Es1 {
    public static void main(String[] args) {
        System.out.println(pariDispari("ciao"));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(1700));
    }

    public static Boolean pariDispari(String text) {
        boolean calcolo;
        if (text.length() % 2 == 0) {
            return calcolo = true;
        } else {
            return calcolo = false;
        }

    }

    public static Boolean annoBisestile(int num) {
        boolean calcolo;
        if (num % 4 == 0 && num % 100 == 0 && num % 400 == 0) {
            return calcolo = true;
        } else {
            return calcolo = false;
        }
    }
}


