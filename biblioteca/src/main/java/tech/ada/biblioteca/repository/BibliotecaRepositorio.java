package tech.ada.biblioteca.repository;


import tech.ada.biblioteca.model.ItemCatalogo;

public interface BibliotecaRepositorio {

    void cadastrar(ItemCatalogo item);

    boolean consultar(String titulo);

    void consultar(ItemCatalogo item);

    void emprestar(ItemCatalogo item);

    void devolver(ItemCatalogo item);


}
