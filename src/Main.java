import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* Przykład 3 switch case */

        /* proste użycie switch case i default */
        int a = 2;
        switch (a) {
            case 2:
                System.out.println("warunek spełniony");
                break;
            default:
                System.out.println("warunek niespełniony");
                break;
        }
        /* wiele case-ow */
        Scanner scan = new Scanner((System.in));
        System.out.print("Podaj liczbę (0 - 5): ");
        switch (scan.nextInt()) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            case 4:
                System.out.println("Cztery");
                break;
            default:
                System.out.println("Pięć");
                break;
        }

        /* Switch case często używany jest z pętlą, gdzie case-y działają jak else if() */
        String text = "aabaacbbaa";
        int[] tablica = {0, 0, 0};
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'a':
                    ++tablica[0];
                    break;
                case 'b':
                    ++tablica[1];
                    break;
                case 'c':
                    ++tablica[2];
                    break;
            }
        }
        System.out.printf("\nLiczba występuje\na: %d - razy\nb: %d - razy\nc: %d - razy",
                tablica[0], tablica[1], tablica[2]);

    }
}
