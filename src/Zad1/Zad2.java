package Zad1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        File file = new File("C:/SDA/11_08/src/Zad1/tekst.txt");
        List<Employee> employees = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {
                //System.out.println(s);
                String[] liniaDanych = s.split(";");
                Employee pracownik = new Employee(liniaDanych[0], liniaDanych[1], liniaDanych[2], Long.parseLong(liniaDanych[3]));
                employees.add(pracownik);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Employee> sortedEmployees = employees.stream()
                .sorted((o1, o2) -> o1.getId().compareTo(o2.getId()))
                .collect(Collectors.toList());

        File plik = null;

        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/SDA/11_08/src/Zad1/sorted_test.txt")));

        for (Employee k : sortedEmployees) {
            System.out.println(k.getName() + " " + k.getSurname());

            try {

                writer.write(k.getName() + ", " + k.getSurname() + ", " + ", " + k.getPosition() + ", " + k.getId()+ "\n");

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        writer.close();
    }
}
