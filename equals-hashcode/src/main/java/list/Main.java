package list;

import queue.CarroQueue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CarroList> listCarros = new ArrayList<>();

        listCarros.add(new CarroList("Ford"));
        listCarros.add(new CarroList("Chevrolet"));
        listCarros.add(new CarroList("Fiat"));
        listCarros.add(new CarroList("Peugeot"));

        System.out.println(listCarros.contains(new CarroList("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new CarroList("Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
