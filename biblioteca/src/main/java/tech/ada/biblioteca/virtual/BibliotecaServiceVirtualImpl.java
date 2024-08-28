package tech.ada.biblioteca.virtual;


import tech.ada.biblioteca.service.BibliotecaServiceImpl;

public class BibliotecaServiceVirtualImpl extends BibliotecaServiceImpl implements BibliotecaServiceVirtual {

    @Override
    public void reservar() {

    }

    @Override
    public boolean consultar(String titulos) {
        return false;
    }



}
