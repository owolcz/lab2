import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

import static java.util.Collections.*;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        scan=new Scanner(System.in);
        ArrayList<String> Zwierzaki =new ArrayList<>();


        for(int i=1; i <=5; i++){
           System.out.println("Podaj nazwę zwierzaka: ");
            Zwierzaki.add(scan.nextLine());
        }


        for (String x : Zwierzaki) {
            System.out.print(x + ", ");
        }
        System.out.println();

        System.out.println("c)");
        Zwierzaki.remove(3);

        Zwierzaki.remove(3);

        Zwierzaki.add("Goryl");

        Zwierzaki.add("Orzeł");

        Zwierzaki.add("Wąż");


        for (String x : Zwierzaki) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Rozmiar listy to: "+Zwierzaki.size());

        System.out.println("D) Odwrotne sortowanie: ");
        Zwierzaki.sort(reverseOrder());
        for (String x : Zwierzaki) {
            System.out.print(x + ", ");
        }
        System.out.println();






         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */


        System.out.println("Zadanie 2) ");
        scan=new Scanner(System.in);
        Set<Integer> Liczby = new TreeSet<>();


        for(int i=1; i <=10; i++){
            System.out.println("Podaj liczbę: ");
            Liczby.add(scan.nextInt());
        }

        System.out.println("Zawartość seta: " + Liczby);

        for (Integer x : Liczby) {
            System.out.print(x + ", ");
        }
        System.out.println();

    }



}
