import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        System.out.println("Zadanie 1:");
        int index = 62642;
        int last2IndexDigits = index % 100;
        System.out.println(last2IndexDigits);


        for( int i = 100; i >0 ; i --)
        {
            System.out.println("i: " + i);
            if (i % last2IndexDigits == 0){

                System.out.println("liczba " + i + " podzielna przez " + last2IndexDigits);


            }
        }



        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }

        for (int a  : numbers) {
            System.out.println(a+ 11);
        }



    }
}
