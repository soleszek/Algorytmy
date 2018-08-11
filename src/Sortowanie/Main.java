package Sortowanie;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        Integer[] liczby = {13, 6, 5, 21, 14, 11, 19, 11, 16};

        System.out.println(linearSearch.search(6, liczby));

    }
}
