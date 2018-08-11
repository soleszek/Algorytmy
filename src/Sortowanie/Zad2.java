package Sortowanie;

public class Zad2 {
    public static void main(String[] args) {
        Integer[] tablica = {9, 2, 0, 1, 3, 5, 6};

        wypisz(3, tablica);
    }

    static void wypisz(int a, Integer[] tablica) {
        for (int i = 0; i < a; i++) {
            System.out.println(tablica[i]);
        }
    }
}
