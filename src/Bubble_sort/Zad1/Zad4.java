package Bubble_sort.Zad1;

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 5, 7, 10, 345, 1};

        wypiszWWierszach(tablica);
    }

    static void wypiszWWierszach(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(Arrays.toString(tablica));
        }
    }
}
