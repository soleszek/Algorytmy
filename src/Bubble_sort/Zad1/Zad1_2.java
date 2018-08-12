package Bubble_sort.Zad1;

import java.util.Arrays;

public class Zad1_2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 87, 4, 23, 89, 12};

        System.out.println(Arrays.toString(zamienElementy(tablica, 1, 8)));

    }

    static int[] zamienElementy(int[] tablica, int a, int b) {

        int temp = 0;

        if(a < tablica.length && b < tablica.length) {

            temp = tablica[a];
            tablica[a] = tablica[b];
            tablica[b] = temp;

        } else {
            System.out.println("Podane elementy wykraczają poza rozmiar tablicy");
        }

        return tablica;
    }
}
