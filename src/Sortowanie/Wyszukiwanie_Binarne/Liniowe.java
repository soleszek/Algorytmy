package Sortowanie.Wyszukiwanie_Binarne;

public class Liniowe {
    public static void main(String[] args) {

        Integer[] tablica = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(BinarySearchLin(tablica, 2));

    }

    static Integer BinarySearchLin(Integer[] tablica, Integer value) {

        int low = 0;
        int high = tablica.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (tablica[mid] > value) {
                high = mid - 1;
            } else if (tablica[mid] < value) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
