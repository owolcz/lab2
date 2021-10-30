public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.println("Zadanie 1: ");
        System.out.println("a) ");
        for (int i = 0; i <= 250; i++) {
            if (i == 190)
                break;
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("b) ");
        for (int i = 0; i <= 25; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }


        System.out.println("\n");
        System.out.println("c) ");
        for (int i = 0; i <= 100; i++) {
            if (i >= 50)
                return;
            System.out.print(i + " ");
        }


    }
}
