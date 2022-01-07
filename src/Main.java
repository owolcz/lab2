import java.util.*;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            /* ćwiczenie 5 Metody */

            /* zad.1
            a) stworzyć tablicę typu int[20],
            b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
            c) napisać metodę, która wypisze otrzymane wartości,
            d) wstawić wywołanie metody do metody main
            */

            System.out.println("Zadanie 1: " );
            int[] tablica1 = metod5(20);
            metoda2(tablica1);
            System.out.println("\n");


            System.out.println("Zadanie 2: ");
            TablicaString(6);


            System.out.println("Zadanie 3: ");
            Imie("Oskar");
            Imie("Oskar", "Wołcz");
            Imie("Oskar", "Wołcz", 22);

//            int[] zmiennaA = metoda6(5, 5);
//            metod4(zmien)

        }


            //Zadanie 1
                public static int[] metod5(int zmienna) {
                    int[] tab;
                    tab = new int[zmienna + 1];
                    for (int i = zmienna + zmienna; i >= zmienna; i--) {
                        tab[zmienna + zmienna  - i] = i;
                    }
                    return tab;
                }

                public static void metoda2(int[] tab) {
                    for(int i : tab) {
                System.out.println(i);
                    }
                }


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        //Zadanie 2
        public static int[] TablicaString(int zmienna){
            Scanner input = new Scanner(System.in);
            String[] tekst = new String[zmienna];
            System.out.println("Wpisz tekst: ");
            {
                //wprowadzenie wartości
                for(int i=0; i<5; i++)

                    tekst[i] = input.nextLine();
            }

            //wyświetlenie
            for(int i=4; i>=0; i--)
                System.out.println("element "+ i +": "+ tekst[i]);
            return new int[0];
        }



        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */


        //Zadanie 3
        public static void Imie(String imie) {
            System.out.println("a) Moje imię: " + imie);
        }

        public static void Imie(String imie, String nazwisko) {
            System.out.println("b) Moje imię oraz nazwisko: " + imie + " " + nazwisko);
        }

        public static void Imie(String imie, String nazwisko, int wiek) {
            System.out.println("c) Moje imię oraz nazwisko i wiek: " + imie + " " + nazwisko + " " + wiek);
        }



        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

            public static int[] metoda6(int zmienna1, int zmienna2) {
                int suma = zmienna1 + zmienna2;
                int[] tab = new int[suma];
                for (int i = 0; i < suma; i++) {
                    tab[i] = i;
                }
                return tab;
            }
            public static int metod4(int zmienna) {
                System.out.print("To jest metoda 4 - ");
                return zmienna + 7;
            }
}


