package Bubble_sort.Zad1;

import java.util.Arrays;

public class BubbleSortVer2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 5, 7, 10, 345, 1};

        wypiszWLiniachCorazMniej(tablica);
    }

    static void wypiszWLiniachCorazMniej (int[] tablica) {

        for(int i = 0; i < tablica.length + 1; i++) {
            int indeks = 0;

            for (int j = 0; j < tablica.length - i; j++) {

                System.out.print(indeks + ":" + tablica[j] + ", ");
                indeks++;

            }
            System.out.println();
        }
    }
}
