package Sortowanie;

public class Zad1 {

    public static void main(String[] args) {
        Integer[] tablicaP = {7, 9, 3, 0, 1, 2};
        Integer[] tablicaN = {9, 2, 0, 1, 3, 5, 6};

        System.out.println(znajdzIndeks(tablicaP));
    }

   static Integer znajdzIndeks(Integer[] tablica) {

        int indeks = 0;

        indeks = tablica.length / 2;


        return tablica[indeks];
    }
}
