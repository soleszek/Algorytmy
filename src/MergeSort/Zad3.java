package MergeSort;

import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {
        int[] tablica1 = {3, 5, 25, 8, 90};
        int[] tablica2 = {123, 2, 10, 345, 1, 45, 12, 90};

        System.out.println(Arrays.toString(mergeDifferentArrays(tablica1, tablica2)));

    }

    static int[] mergeDifferentArrays (int[] table1, int[] table2) {

        int[] table = new int[table1.length + table2.length];
        int indeks1 = 0;
        int indeks2 = 0;

        for (int i = 0; i < table.length; i++ ) {

            if (indeks2 < table1.length)  {
                if (i % 2 == 0) {
                    table[i] = table1[indeks1];
                    indeks1++;

                } else {
                    table[i] = table2[indeks2];
                    indeks2++;
                }
            } else {
                table[i] = i;
            }
        }

        return table;
    }

}
