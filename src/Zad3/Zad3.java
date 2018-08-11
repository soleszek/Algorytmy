package Zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zad3 {
    public static void main(String[] args) {
        Map<String, Long> mapa = new HashMap<>();

        mapa.put("Sylwester", 16000L);
        mapa.put("katarzyna", 65000L);
        mapa.put("Łukasz", 1000L);
        mapa.put("Paweł", 540000L);
        mapa.put("Tomasz", 870000L);
        mapa.put("grażyna", 5000L);

        Map<String, Long> mapaFiltrowana = mapa.entrySet().stream()
                .filter(x -> x.getKey().contains("k") || x.getKey().contains("g"))
                .filter(x -> x.getValue() > 10000L)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(mapaFiltrowana);
    }
}
