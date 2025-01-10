package one.digitalinovation.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private String titulo;
    private String descricao;
    private LocalDateTime date;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime data) {
        this.date = data;
    }
}
