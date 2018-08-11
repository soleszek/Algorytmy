package Zad1;

import java.util.*;

public class Zad1 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        String imie = "";
        String dzial = "";

        Map<String, List<String>> dane = new HashMap<>();

        while (true) {

            System.out.println("Wpisz imię i nazwę działu: ");

            imie = skaner.nextLine();

            if (imie.equals("list")) {
                break;
            }

            dzial = skaner.nextLine();

            if (!dane.containsKey(dzial)) {
                List<String> pracownicy = new ArrayList<>();
                pracownicy.add(imie);
                dane.put(dzial, pracownicy);
            } else {
                dane.get(dzial).add(imie);
            }

        }

        System.out.println(dane);
    }
}
