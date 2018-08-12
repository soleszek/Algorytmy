package Bubble_sort.Zad1;

public class Zad2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 1, 8, 90, 5, 7, 10, 345, 1};

        wypiszZIndeksem(tablica);

    }

    static void wypiszZIndeksem(int[] tablica) {
        int index = 0;
        for (int i : tablica) {
            System.out.println(index + " : " + i);
            index++;
        }
    }
}
