import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* przykład 5 Metody */
        /* wywołanie metod */
        metoda1();
        metoda1(5);
        metoda1(6, "JAVA");
        metoda2("JAVA");

        System.out.println(metoda3());
        System.out.println(metod4(8));

        int[] tablica1 = metod5(18);
        metoda2(tablica1);
        System.out.println("\n");

//        int[] tablica2 = metod5(18);
        metoda2(metod5(18, 19));
    }

    /* metody typu void */
    public static void metoda1() {
        System.out.println("To jest metoda 1");
    }

    public static void metoda1(int zmienna) {
        System.out.println("To jest metoda 1 z parametrem: " + zmienna);
    }

    public static void metoda1(int zmienna, String text) {
        System.out.println("To jest metoda 1 z parametrem: " + zmienna + " i tekst: " + text);
    }

    public static void metoda2(String text) {
        for (int zmienna : text.toCharArray()) {
            System.out.print(zmienna + " "); // wyświetla numer liter w kodzie ASCII
        }
    }

    public static void metoda2(int[] tab) {
        for (int zmienna : tab) {
            System.out.print(zmienna + " "); // wyświetla numer liter w kodzie ASCII
        }
    }

    /* metody zwracające wartość */
    public static String metoda3() {
        return "\nText metody";
    }

    public static int metod4(int zmienna) {
        System.out.print("To jest metoda 4 - ");
        return zmienna + 7;
    }

    public static int[] metod5(int zmienna) {
        int[] tab = new int[zmienna];
        for (int i = 0; i < zmienna; i++) {
            tab[i] = i;
        }
        return tab;
    }

    public static int[] metod5(int zmienna1, int zmienna2) {
        int max = zmienna1 > zmienna2 ? zmienna1 : zmienna2;
        int[] tab = new int[max];
        for (int i = 0; i < max; i++) {
            tab[i] = i;
        }
        return tab;
    }

}
