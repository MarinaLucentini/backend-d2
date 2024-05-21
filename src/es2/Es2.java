package es2;

public class Es2 {
    public static void main(String[] args) {
        System.out.println(text(0));
        System.out.println(text(6));
    }

    public static String text(int num) {
        String risultato;
        switch (num) {
            case 0: {
                risultato = "zero";
                break;
            }
            case 1: {
                risultato = "uno";
                break;
            }
            case 2: {
                risultato = "due";
                break;
            }
            case 3: {
                risultato = "tre";
                break;
            }
            default: {
                risultato = "errore num maggiore di 3 ";
            }
        }
        return risultato;
    }
}

