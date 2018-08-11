package Sortowanie.Zadania_Algorytmy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Main3_Sorted {
    public static void main(String[] args) {
        Osoba sylwek = new Osoba("Sylwester", "Oleszek", 35);
        Osoba kasia = new Osoba("Katarzyna", "Oleszek", 35);
        Osoba bartek = new Osoba("Bartosz", "Kozłowski", 34);
        Osoba krzysztof = new Osoba("Krzysztof", "Froncze", 59);
        Osoba konrad = new Osoba("Konrad", "Fronczek", 30);
        Osoba lukasz = new Osoba("Łukasz", "Ciuraj", 30);
        Osoba krystyna = new Osoba("Krystyna", "Oleszek", 58);
        Osoba agnieszka = new Osoba("Agnieszka", "Rado", 39);
        Osoba kacper = new Osoba("Kacper", "Rado", 15);
        Osoba paulina = new Osoba("Paulina", "Rado", 17);
        Osoba janusz = new Osoba("Janusz", "Ciuraj", 61);

        Osoba[] osoby = {sylwek, kasia, bartek, krzysztof, konrad, lukasz, krystyna, agnieszka, kacper, paulina, janusz};

        System.out.println(wyszukajOsobe(osoby, 58));
    }

    static Osoba wyszukajOsobe (Osoba[] osoby, int wiek) {

        Arrays.sort(osoby, new CompareOsoby());

        int low = 0;
        int high = osoby.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (osoby[mid].getAge() > wiek) {
                high = mid - 1;
            } else if (osoby[mid].getAge() < wiek) {
                low = mid + 1;
            } else {
                return osoby[mid];
            }
        }


        return null;
    }
}
