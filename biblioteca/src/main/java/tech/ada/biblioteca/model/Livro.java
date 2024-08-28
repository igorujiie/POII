package tech.ada.biblioteca.model;

public class Livro extends ItemCatalogo {

    private String isbn;
    private String editora;
    private int numeroPaginas;

    public Livro(String titulo) {
        super(titulo);
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
