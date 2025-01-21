package set.exercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioProposto2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new HashSet<>();
        linguagens.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        linguagens.add(new LinguagemFavorita("Javascript", 1995, "Vscode"));
        linguagens.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));

        System.out.println("Ordem de inserção:");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(Arrays.asList(
                new LinguagemFavorita("Python", 1991, "Pycharm"),
                new LinguagemFavorita("Javascript", 1995, "Vscode"),
                new LinguagemFavorita("Java", 1991, "IntelliJ")
        ));

        for (LinguagemFavorita linguagem: linguagens1) {
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparadorIDE());
        minhasLinguagensFavoritas3.addAll(linguagens);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas3) {
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparadorAnoCriação());
        minhasLinguagensFavoritas4.addAll(linguagens);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas4) {
            System.out.println(linguagem);
        }
    }
}
