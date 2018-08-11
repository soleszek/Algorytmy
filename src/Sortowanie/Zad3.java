package Sortowanie;

public class Zad3 {
    public static void main(String[] args) {
        Integer[] tablica = {9, 2, 0, 1, 3, 5, 6};

        wypisz(3, tablica);
    }

    static void wypisz(int b, Integer[] tablica) {
        for (int i = b; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
