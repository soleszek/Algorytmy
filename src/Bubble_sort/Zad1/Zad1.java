package Bubble_sort.Zad1;

public class Zad1 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90};

        for (int i : zamianaMiejscami(tablica, 1, 3)) {
            System.out.println(i);
        }
    }

    static int[] zamianaMiejscami(int[] tablica, int a, int b) {

        if (a < (tablica.length) && b < (tablica.length)) {

            int temp = tablica[a];
            tablica[a] = tablica[b];
            tablica[b] = temp;

        } else {
            System.out.println("Podane liczby są poza zakresem tablicy!");
        }

        return tablica;
    }

}
