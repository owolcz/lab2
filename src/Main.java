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
        for (int x : tab1) {
            System.out.print(x + ", ");
        }

        System.out.println("\n");
        System.out.println("b) ");
        double[] tab2 = {1.5, 2.7, 4.9, 7.13, 9.3131};
        for (double y : tab2) {
            System.out.print(y + ", ");
        }

        System.out.println("\n");
        System.out.println("c) ");
        String[] tab3 = {"Audi", "BMW", "Mercedes", "Lexus", "Tesla"};
        for (String z : tab3) {
            System.out.print(z + ", ");
        }


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        System.out.println("\n\n");
        System.out.println("Zadanie 3: ");
        while(true)
        {
            System.out.println("Infinite loop");
        }
        //Pętla while(true) jest pętlą nieskończoną


//        while(false)
//        {
//            System.out.println();
//        }
        //Pętla while(false) nie uruchomi nigdy kodu

    }
}
