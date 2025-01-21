package set;

import java.util.Comparator;

public class ComparatorNomeTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome= s1.getNome().compareTo( s2.getNome());
        if(nome != 0){
            return nome;
        }
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
