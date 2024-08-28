package tech.ada.biblioteca.model;

import java.time.LocalDate;

public abstract class ItemCatalogo {

    private String titulo;
    private String autor;
    private LocalDate data;

    public ItemCatalogo(String titulo) {
        this.titulo = titulo;
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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if (this.titulo != null && this.titulo.equalsIgnoreCase(item.getTitulo()))
            return true;

        return false;
    }
}
