import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        System.out.println("Zadanie 1:");
        int i = 1000;
        int index = 62642;
        int last2IndexDigits = index % 100;
        System.out.println(last2IndexDigits);

        do {
            System.out.println("i: " + i);
            if (i % last2IndexDigits == 0){

                System.out.println("liczba " + i + " podzielna przez " + last2IndexDigits);


            }
        } while (--i > 0);







        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("\n\n");
        System.out.println("Zadanie 2: ");
        System.out.println("a) ");

        int[] tab1 = {1, 2, 4, 7, 9};
        int x = 0;
        while (x < tab1.length) {
            int num = tab1[x];
            System.out.println(num);
            x++;
        }

        System.out.println("\n");
        System.out.println("b) ");

        double[] tab2 = {1.5, 2.1231, 4.123, 7.5, 9.69};
        int y = 0;
        while (y < tab2.length) {
            double num2 = tab2[y];
            System.out.println(num2);
            y++;
        }

        System.out.println("\n");
        System.out.println("c) ");
        String[] tab3 = {"Audi", "BMW", "Mercedes", "Lexus", "Tesla"};
        int z = 0;
        while (z < tab3.length) {
            String num3 = tab3[z];
            System.out.println(num3);
            z++;
        }


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        System.out.println("\n\n");
        System.out.println("Zadanie 3: ");

//        while(true)
//        {
//            System.out.println("Infinite loop");
//        }
        //Pętla while(true) jest pętlą nieskończoną


//        while(false)
//        {
//            System.out.println();
//        }
        //Pętla while(false) nie uruchomi nigdy kodu

    }
}
