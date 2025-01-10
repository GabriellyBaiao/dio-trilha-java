package one.digitalinovation.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo){
       if (conteudosInscritos.contains(conteudo)){
           System.out.println("Você já se inscreveu nesse conteudo");
       } else{
           conteudosInscritos.add(conteudo);
       }
    }

    public double calcularTotalXp(){
        return conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                        .sum();
    }

    public void inscrever(Bootcamp bootcamp){
//        Alternativa 1: foreach tradicional
        for (Conteudo conteudo : bootcamp.getConteudos() ) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
//        Alternativa 2: API de stream.
        bootcamp.getConteudos().stream().forEach(this::inscrever);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else{
            System.out.println("Você não está mais inscrito em nenhum conteudo");
        }
    }
}
