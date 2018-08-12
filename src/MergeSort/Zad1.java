package MergeSort;

import java.util.Arrays;

public class Zad1 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 25, 8, 90, 123, 2, 10, 345, 1};

        divideTable(tablica);

    }

    static void divideTable(int[] tablica) {

        int x = tablica.length / 2;

        int[] tablica1 = new int[x];
        int[] tablica2 = new int[x];

        for (int i = 0; i < x; i++) {
            tablica1[i] = tablica[i];
        }

        int indeks = 0;

        for (int j = x; j < tablica.length; j++) {
            tablica2[indeks] = tablica[j];
            indeks++;
        }

        System.out.println(Arrays.toString(tablica1) + " oraz " + Arrays.toString(tablica2));
    }
}
