package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Ex1 {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(24.0);
        temperaturas.add(30.0);
        temperaturas.add(18.0);
        temperaturas.add(20.0);
        temperaturas.add(17d);
        temperaturas.add(5d);

        String meses[] = {"1 – Janeiro", "2 – Fevereiro", "3 – Março", "4 – Abril", "5 – Maio", "6 – Junho", "7 – Julho", "8 – Agosto", "9 – Setembro", "10 – Outubro", "11 – Novembro", "12 – Dezembro"};

        System.out.println(temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das temperaturas: " + soma);
        Double media = soma/temperaturas.size();
        System.out.println("Média: " + media);

        System.out.println("Temperaturas acima da média semestral: ");

        for (int i = 0; i < temperaturas.size(); i++) {
            if(temperaturas.get(i) > media){
                System.out.printf("%s: %.2f°C\n", meses[i], temperaturas.get(i));
            }

        }

    }

}
