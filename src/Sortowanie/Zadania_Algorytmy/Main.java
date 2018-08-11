package Sortowanie.Zadania_Algorytmy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Osoba sylwek = new Osoba("Sylwester", "Oleszek", 35);
        Osoba kasia = new Osoba("Katarzyna", "Oleszek", 34);
        Osoba bartek = new Osoba("Bartosz", "Kozłowski", 33);
        Osoba krzysztof = new Osoba("Krzysztof", "Froncze", 59);
        Osoba konrad = new Osoba("Konrad", "Fronczek", 30);
        Osoba lukasz = new Osoba("Łukasz", "Ciuraj", 29);
        Osoba krystyna = new Osoba("Krystyna", "Oleszek", 58);
        Osoba agnieszka = new Osoba("Agnieszka", "Rado", 39);
        Osoba kacper = new Osoba("Kacper", "Rado", 15);
        Osoba paulina = new Osoba("Paulina", "Rado", 17);
        Osoba janusz = new Osoba("Janusz", "Ciuraj", 61);

        Osoba[] osoby = {sylwek, kasia, bartek, krzysztof, konrad, lukasz, krystyna, agnieszka, kacper, paulina, janusz};
        //List<Osoba> listaOsob = new ArrayList<>(Arrays.asList(sylwek, kasia, bartek, krzysztof, konrad, lukasz, krystyna, agnieszka, kacper, paulina, janusz));

        System.out.println(wyszukajOsobe(osoby, 15));

    }

    static String wyszukajOsobe (Osoba[] osoby, int wiek) {



        /*int low = 0;
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
        }*/

        Integer indeks = 0;

        for (int i = 0; i < osoby.length; i++) {
            if (osoby[i].getAge() == wiek) {
                indeks = i;

                String taOsoba = indeks.toString() + " : " + osoby[indeks].toString();

                return taOsoba;
            }
        }

        return null;
    }

}
