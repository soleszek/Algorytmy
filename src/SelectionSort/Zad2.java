package SelectionSort;

public class Zad2 {
    public static void main(String[] args) {
        int[] tablica = {3, 5, 25, 8, 90, 123, 2, 10, 345, 1};

        findMinimalValueFromAToB(tablica, 2, 7);

    }

    static void findMinimalValueFromAToB(int[] tablica, int a, int b) {

        int temp = tablica[0];

        for (int i = a; i < b; i++) {

            if (temp > tablica[i]) {

                temp = tablica[i];

            }


        }
        System.out.println("Wartość minimalna tablicy to: " + temp);

    }

}
