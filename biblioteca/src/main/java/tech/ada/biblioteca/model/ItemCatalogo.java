package tech.ada.biblioteca.model;

import java.time.LocalDate;

public abstract class ItemCatalogo {

    private String titulo;
    private String autor;
    private LocalDate data;
    private SituacaoLivro situacao;



    public ItemCatalogo(String titulo) {
        this.titulo = titulo;
        this.situacao = SituacaoLivro.DISPONIVEL;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public SituacaoLivro getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoLivro situacao) {
        this.situacao = situacao;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ItemCatalogo that = (ItemCatalogo) obj;
        return titulo.equals(that.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }

}
