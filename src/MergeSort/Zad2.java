package MergeSort;

import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {
        int[] tablica1 = {3, 5, 25, 8, 90};
        int[] tablica2 = {123, 2, 10, 345, 1};

        System.out.println(Arrays.toString(mergeArrays(tablica1, tablica2)));

    }

    static int[] mergeArrays (int[] table1, int[] table2) {

        int[] table = new int[table1.length + table2.length];
        int indeks1 = 0;
        int indeks2 = 0;

        for (int i = 0; i < table.length; i++ ) {

            if (indeks1 < table1.length || indeks2 < table2.length) {
                if (i % 2 == 0) {
                    table[i] = table1[indeks1];
                    indeks1++;

                } else {
                    table[i] = table2[indeks2];
                    indeks2++;
                }
            }
        }

        return table;
    }

}
