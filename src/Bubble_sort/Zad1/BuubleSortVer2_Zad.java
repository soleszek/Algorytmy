package Bubble_sort.Zad1;

import java.util.Arrays;

public class BuubleSortVer2_Zad {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 5, 7, 10, 345, 1};
        System.out.println(Arrays.toString(bubbleSortVer2(tablica)));
    }

    static int[] bubbleSortVer2 (int[] tablica) {
        int temp = 0;
        for (int i = tablica.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ( tablica[j] > tablica[j + 1]) {
                    temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }

        return tablica;
    }

}
