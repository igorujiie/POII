package tech.ada.biblioteca.model;

import java.time.LocalDate;

public class Revista extends ItemCatalogo {

    private int numeroEdicao;

    private String mesPublicacao;

    private String categoria;

    public Revista(String titulo) {
        super(titulo);
    }


    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
