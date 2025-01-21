package set;

import stack.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<CarroSet> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new CarroSet("Ford"));
        hashSetCarros.add(new CarroSet("Chevrolet"));
        hashSetCarros.add(new CarroSet("Fiat"));
        hashSetCarros.add(new CarroSet("Pegeot"));
        hashSetCarros.add(new CarroSet("Zip"));
        hashSetCarros.add(new CarroSet("Alfa Romeo"));

        System.out.println(hashSetCarros);

        Set<CarroSet> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new CarroSet("Ford"));
        treeSetCarros.add(new CarroSet("Chevrolet"));
        treeSetCarros.add(new CarroSet("Fiat"));
        treeSetCarros.add(new CarroSet("Peugeot"));
        treeSetCarros.add(new CarroSet("Zip"));
        treeSetCarros.add(new CarroSet("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
