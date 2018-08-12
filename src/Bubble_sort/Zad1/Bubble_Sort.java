package Bubble_sort.Zad1;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 5, 7, 10, 345, 1};
        System.out.println(Arrays.toString(bubbleSort2(tablica)));
    }

    static int[] bubbleSort2 (int[] tablica) {
        int temp = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }

        return tablica;
    }
}
