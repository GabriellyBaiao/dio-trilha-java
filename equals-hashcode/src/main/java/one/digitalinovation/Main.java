package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CarroHash> listaCarros = new ArrayList<>();

        listaCarros.add(new CarroHash("Ford"));
        listaCarros.add(new CarroHash("Chevrolet"));
        listaCarros.add(new CarroHash("Volksvagem"));

        System.out.println(listaCarros.contains(new CarroHash("Ford")));
        System.out.println(new CarroHash("Ford").hashCode());
        System.out.println(new CarroHash("Ford1").hashCode());

        CarroHash carro1 = new CarroHash("Ford");
        CarroHash carro2 = new CarroHash("Chevrolet");
        System.out.println(carro1.equals(carro2));
    }
}
