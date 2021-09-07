public class Main {

    public static void main(String[] args) {

        /* Przykład.1 */

        /* Pętle while */
        int i = 10;
        while (i > 0) {
            System.out.println("i: " + i);
            --i;
        }

        i = 10;
        System.out.println("\n");
        while ((--i) > 0) {
            System.out.print("\nindex: " + i);
            if (i % 3 == 0) {
                System.out.print(" - podzielna przez 3");
            }
        }

        /* Pętla w pętli */
        int j;
        System.out.println("\n\n");
        while (++i < 10) {
            System.out.println("i: " + i);
            j = 3;
            while (--j > 0) {
                System.out.println("\n\tj: " + j);
            }
        }

        /* Pętla do-while */
        i = 10;
        System.out.println("\n");
        do {
            System.out.println("i: " + i);
        } while (--i > 0);

    }
}
