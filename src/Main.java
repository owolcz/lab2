import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* Przyklad_6 Listy
           operują na typach objektowych */
        List<Integer> lista1 = new ArrayList<>();
        List<BigInteger> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<BigDecimal> lista4 = new ArrayList<>();
        List<Character> lista5 = new ArrayList<>(); // objektowy char
        List<Object> lista6 = new ArrayList<>();

        /* przypisanie wartości */
        lista1.add(1);
        lista1.add(5);
        lista1.add(12);
        lista1.add(3);
        lista1.add(7);
        lista1.add(9);
        lista1.add(2);
        System.out.println(lista1 + ", wielkość listy - " + lista1.size()); // [1, 5, 12, 3, 7, 9, 2]

        /* odczytanie wartości elementu */
        System.out.println("Pierwszy element: " + lista1.get(0) +
                "\nDrugi element listy: " + lista1.get(1));

        /* usówanie wartości, element o indeksie 2 został usunięty z listy */
        lista1.remove(2);
        System.out.println(lista1 + ", wielkość listy - " + lista1.size()); // [1, 5, 3, 7, 9, 2]

        /* stworzenie listy z tablicy */
        Integer[] tablica1 = new Integer[]{1, 5, 6, 8, 90, 3};
        lista1 = Arrays.stream(tablica1).toList();
        System.out.println(lista1); // [1, 5, 6, 8, 90, 3]

        /* dynamiczna inicjalizacja listy */
        lista1 = Arrays.asList(1, 4, 6, 9, 8, 3, 2);
        System.out.println(lista1); // [1, 4, 6, 9, 8, 3, 2]

        /* Sortowanie */
        Collections.sort(lista1);
        System.out.println(lista1); // [1, 2, 3, 4, 6, 8, 9]

        /* Sortowanie od końca */
        Collections.sort(lista1, Collections.reverseOrder());
        System.out.println(lista1); // [9, 8, 6, 4, 3, 2, 1]


        /* Przykład tworzenia Set-a */
        Set<String> imiona = new TreeSet<>();
        imiona.add("Kasia");
        imiona.add("Ania");
        imiona.add("Ania");
        imiona.add("Wojtek");
        imiona.add("Zuza");
        imiona.add("Zuza");

        System.out.println("imiona: " + imiona); // [Ania, Kasia, Wojtek, Zuza]
        System.out.println(imiona.size()); // 4

    }

}
