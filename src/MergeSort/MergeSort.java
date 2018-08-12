package MergeSort;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 25, 8, 90, 123, 2, 10, 345, 1};

        System.out.println(Arrays.toString(mergeSort(tablica, 0, 9)));

    }

    static int[] mergeSort(int[] tablica, int l, int r) {

        int m = 0;

        if (l < r) {
            m = (l + r) / 2;
            mergeSort(tablica, l, m);
            mergeSort(tablica, l + 1, r);

            
        }

        return tablica;
    }

}
