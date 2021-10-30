import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        System.out.println("Zadanie 1: ");
        System.out.println("a) ");
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        switch (a % 2){

            case 0:
                System.out.println("Parzysta");

            default:
                System.out.println("Nieparzysta");        }





//                Scanner scan = new Scanner((System.in));
//        System.out.print("Podaj liczbę (0 - 5): ");
//        switch (scan.nextInt()) {
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("Jeden");
//                break;
//            case 2:
//                System.out.println("Dwa");
//                break;
//            case 3:
//                System.out.println("Trzy");
//                break;
//            case 4:
//                System.out.println("Cztery");
//                break;
//            default:
//                System.out.println("Pięć");
//                break;
//        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */


    }
}
