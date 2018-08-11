package Sortowanie.Zadania_Algorytmy;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CompareOsoby implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        if (o1.getAge() > o2.getAge()) {
            return 0;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Comparator<Osoba> reversed() {
        return null;
    }

    @Override
    public Comparator<Osoba> thenComparing(Comparator<? super Osoba> other) {
        return null;
    }

    @Override
    public <U> Comparator<Osoba> thenComparing(Function<? super Osoba, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Osoba> thenComparing(Function<? super Osoba, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Osoba> thenComparingInt(ToIntFunction<? super Osoba> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Osoba> thenComparingLong(ToLongFunction<? super Osoba> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Osoba> thenComparingDouble(ToDoubleFunction<? super Osoba> keyExtractor) {
        return null;
    }
}
