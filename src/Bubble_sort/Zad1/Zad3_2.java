package Bubble_sort.Zad1;

public class Zad3_2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 87, 4, 23, 89, 12};
        wypiszWLiniach(tablica);
    }

    static void wypiszWLiniach (int[] tablica) {

        for(int i = 0; i < tablica.length; i++) {
            int indeks = 0;
            for (int j : tablica) {
                System.out.print(indeks + ":" + j + ", ");
                indeks++;
            }
            System.out.println();
        }
    }
}
