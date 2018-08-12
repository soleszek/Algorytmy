package MergeSort;

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        int[] tablica1 = {3, 5, 25, 8, 90};
        int[] tablica2 = {123, 2, 10, 345, 1};

        System.out.println(Arrays.toString(sortAndMerge(tablica1, tablica2)));

    }

    static int[] sortAndMerge(int[] tablica1, int[] tablica2) {

        int[] tablica = new int[tablica1.length + tablica2.length];
        int indeks1 = 0;
        int indeks2 = 0;

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        for (int i = 0; i < tablica.length; i++) {

            //if(indeks1 < tablica1.length || indeks2 < tablica2.length) {
                if (indeks1 < tablica1.length && tablica1[indeks1] < tablica2[indeks2]) {
                    tablica[i] = tablica1[indeks1];
                    indeks1++;
                } else if (indeks2 < tablica2.length){
                    tablica[i] = tablica2[indeks2];
                    indeks2++;
                }
            //}

        }

        return tablica;
    }

}
