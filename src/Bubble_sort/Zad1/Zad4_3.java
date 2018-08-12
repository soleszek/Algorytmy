package Bubble_sort.Zad1;

import static Bubble_sort.Zad1.Zad4_2.wypiszZPrzesunieciem;

public class Zad4_3 {
    public static void main(String[] args) {
        int[] tablica = {7, 5, 1, 8, 90, 87, 4, 23, 89, 12};
        wypiszZPrzesunieciem(tablica);
    }

    static void wypiszZPrzesunieciem(int[] tablica) {
        int temp = 0;
        for (int i = 0; i < tablica.length; i++) {
            int indeks = 0;
            for (int j : tablica) {
                System.out.print(indeks + ":" + j + ", ");
                indeks++;
            }
            System.out.println();

            if (i + 1 < tablica.length) {
                if (tablica[i] > tablica[i + 1]) {
                    temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }
            }
        }
    }

}
