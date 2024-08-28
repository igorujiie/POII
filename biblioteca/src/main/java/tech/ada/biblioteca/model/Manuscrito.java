package tech.ada.biblioteca.model;


public class Manuscrito extends ItemCatalogo {

    private String localOrigem;
    private String estadoConservacao;
    private boolean digitalizado;

    public Manuscrito(String titulo) {
        super(titulo);
    }
}
