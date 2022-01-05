import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

//        TablicaString();
//        metoda2(metod5());



        Imie("Oskar");
        Imie("Oskar", "Wołcz");
        Imie("Oskar", "Wołcz", 22);

        sumInt(20);
    }

    public static void metoda2(int[] tab) {
        for (int zmienna : tab) {
            System.out.print(zmienna + " "); // wyświetla numer liter w kodzie ASCII
        }
    }


    public static int[] metod5() {
        int[] tab = new int[20];
        for (int i = 19; i > 0; i--) {
            tab[i] = i;
        }
        return tab;
    }

        public static void Tablicaa() {
            int[] tablica = new int[20];

            for (int i = 0; i < 20 ; i++)
                tablica[i] = i + 1;

            int co = tablica[10];


                System.out.println("Kolejna komórka to: " + tablica[20]);
        }




        public static void UzupelnijTablice(int zmienna) {
            System.out.println("Zadanie 1: ");
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[20];
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.println("Please enter number");
                numbers[i] = input.nextInt();
            }

            for (int a  : numbers) {
                System.out.println(a+ 11);
            }
        }

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */


        public static void TablicaString(){
            Scanner input = new Scanner(System.in);
            String[] tekst = new String[6];
            for (int i = 0; i < tekst.length; i++)
            {
                System.out.println("Please enter text");
                tekst[i] = String.valueOf(input.nextInt());
            }



        }

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

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

    static int sumInt(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sumInt(n / 10));
    }
}


