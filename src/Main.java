import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* przykład continue break */

        /* przykład użycia continue */
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /* przykła użycia break */
        for (int i = 0; i <= 100; i++) {
            if (i == 22)
                break;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /* przykła użycia return */
        for (int i = 0; i <= 100; i++) {
            if (i == 33)
                return;
            System.out.print(i + " ");
        }

    }
}
