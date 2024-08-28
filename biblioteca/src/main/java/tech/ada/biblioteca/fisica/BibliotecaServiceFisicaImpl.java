package tech.ada.biblioteca.fisica;


import tech.ada.biblioteca.model.ItemCatalogo;
import tech.ada.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.biblioteca.service.BibliotecaServiceImpl;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica {

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void reservar() {
        System.out.println("reservar");
    }

    @Override
    public boolean consultar(String titulo) {
        return super.consultar(titulo);
    }

    @Override
    public void emprestar(ItemCatalogo item) {
        super.repositorio.emprestar(item);

    }

    @Override
    public void devolver(ItemCatalogo item) {
        super.repositorio.devolver(item);
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        super.repositorio.cadastrar(item);
        System.out.println("item " + item + " cadastrado!");
    }


    @Override
    public void consultar(ItemCatalogo item) {
        super.repositorio.consultar(item);
    }
}