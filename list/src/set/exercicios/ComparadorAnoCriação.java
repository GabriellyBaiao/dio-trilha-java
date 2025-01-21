package set.exercicios;

import java.util.Comparator;

public class ComparadorAnoCriação implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoComparacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if(anoComparacao != 0){
            return anoComparacao;
        }
        return o1.getNome().compareTo(o2.getNome());
    }
}
