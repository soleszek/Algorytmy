package Sortowanie.Wyszukiwanie_Binarne;

import Sortowanie.SearchAlgorithm;

import java.util.List;

public class Rekurencyjne {

    public static void main(String[] args) {
        Integer[] tablica = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(BinarySearchRec(tablica, 8, 0, tablica.length - 1));
    }

    static Integer BinarySearchRec(Integer[] tablica, int value, int low, int high) {
        //int mid = 0;
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (tablica[mid] > value) {
            return BinarySearchRec(tablica, value, low, mid - 1);
        } else if (tablica[mid] < value) {
            return BinarySearchRec(tablica, value, mid + 1, high);
        } else {
            return mid;
        }
    }

}
