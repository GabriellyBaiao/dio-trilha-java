package list;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class Ex2 {
    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Telefonou para a vítima?");
        String tel = sc.next();
        respostas.add(tel.toLowerCase());

        System.out.println("2. Esteve no local do crime?");
        String localCrime = sc.next();
        respostas.add(localCrime.toLowerCase());

        System.out.println("3. Mora perto da vítima?");
        String moraPerto = sc.next();
        respostas.add(moraPerto.toLowerCase());

        System.out.println("4. Devia para a vítima?");
        String devia = sc.next();
        respostas.add(devia.toLowerCase());

        System.out.println("5. Já trabalhou com a vítima?");
        String trabalhou = sc.next();
        respostas.add(trabalhou.toLowerCase());

        System.out.println(respostas);

        int count = 0;

        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }
        }

        switch (count){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                case 4:
                    System.out.println("Cúmplice");
                    break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;

        }
    }
}
