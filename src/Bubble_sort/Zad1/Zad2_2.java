package Bubble_sort.Zad1;

public class Zad2_2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 87, 4, 23, 89, 12};

        wypiszWartosci(tablica);

    }

    static void wypiszWartosci (int[] tablica) {

        int indeks = 0;

        for (int i : tablica) {

            System.out.print(indeks + ":" + i + ", ");
            indeks++;
        }
    }

}
