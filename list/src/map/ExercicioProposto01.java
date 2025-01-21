package map;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um  dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacoes = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543 );
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacoes);

        System.out.println("Substitua a população do estado RN por: 3.534.165");
        populacoes.put("RN", 3534165);
        System.out.println(populacoes);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        populacoes.put("PB", 4039277);
        System.out.println(populacoes);

        System.out.println("Exiba a população do estado PE: " + populacoes.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem em que foram informados: ");
        Map<String, Integer> populacoes2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543 );
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacoes2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacoes3 = new TreeMap<>(populacoes);
        System.out.println(populacoes3);

        Collection<Integer> populacao = populacoes.values();
        String estadoDeMaiorPopulacao = "";
        String estadoDeMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry: populacoes.entrySet()){
            if(entry.getValue().equals(Collections.max(populacao))){
                estadoDeMaiorPopulacao = entry.getKey();
            } if(entry.getValue().equals(Collections.min(populacao))){
                estadoDeMenorPopulacao = entry.getKey();
            }
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoDeMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoDeMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacoes.values().iterator();
        while (iterator.hasNext()){

            soma += iterator.next();
        }
        System.out.println("Exiba a soma da populaçao desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacoes.size()));
        System.out.println("Remova os estados com população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacoes.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() <= 4000000){
                iterator1.remove();
            }
        }
        System.out.println(populacoes);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas:  ");
        populacoes.clear();
        System.out.println(populacoes);

        System.out.println("Confira se alista está vazia: " + populacoes.isEmpty());

    }
}
