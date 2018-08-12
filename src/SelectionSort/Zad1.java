package SelectionSort;

public class Zad1 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 25, 8, 90, 123, 2, 10, 345, 1};
        findMinimalValue(tablica);
    }

    static void findMinimalValue(int[] tablica) {

        int temp = tablica[0];

        for (int i = 0; i < tablica.length; i++) {

            if (temp > tablica[i]) {

                temp = tablica[i];

            }


        }
        System.out.println("Wartość minimalna tablicy to: " + temp);

    }

}
