package map;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.function.Function;

import static javax.swing.UIManager.put;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioProposto03 {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon",1111 ));
        }};
        System.out.println(contatos);
        for (Map.Entry<Integer, Contato> entry: contatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> contatos1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(contatos1);
        for(Map.Entry<Integer, Contato> entry: contatos1.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> contatos2 = new TreeMap<>(contatos);
        System.out.println(contatos2);
        for(Map.Entry<Integer, Contato> entry: contatos2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
//                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
//            }
//        });
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Contato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, Contato> cont) {
//                        return cont.getValue().getNumero();
//                    }
//                }));
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        set.addAll(contatos.entrySet());
        for (Map.Entry<Integer, Contato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
//        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNome());
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        set1.addAll(contatos.entrySet());
        for(Map.Entry<Integer, Contato> entry: set1){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }



    }

}
