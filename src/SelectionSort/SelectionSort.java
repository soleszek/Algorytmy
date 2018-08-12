package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 25, 8, 90, 123, 2, 10, 345, 21};

        System.out.println(Arrays.toString(selectionSort(tablica)));

    }

    static int[] selectionSort (int[] tablica) {

        int imin = 0;
        int temp = 0;

        for (int i = 0; i < tablica.length; i++) {

            imin = i;

            if (i + 1 < tablica.length) {
                for (int j = i + 1; j < tablica.length; j++) {
                    if (tablica[j] < tablica[imin]) {
                        imin = j;

                        temp = tablica[i];
                        tablica[i] = tablica[imin];
                        tablica[imin] = temp;
                    }
                }
            }

        }

        return tablica;
    }
}
