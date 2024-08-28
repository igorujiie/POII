package tech.ada.biblioteca.service;


import tech.ada.biblioteca.model.ItemCatalogo;
import tech.ada.biblioteca.repository.BibliotecaRepositorio;

public abstract class BibliotecaServiceImpl {

    protected BibliotecaRepositorio repositorio; // interface tá?

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean consultar(String titulo) {
        return repositorio.consultar(titulo);
    }


    public void consultar(ItemCatalogo item) {
    }



}
