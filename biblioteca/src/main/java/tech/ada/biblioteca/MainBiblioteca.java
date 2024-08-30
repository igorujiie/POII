package tech.ada.biblioteca;


import tech.ada.biblioteca.fisica.BibliotecaServiceFisica;
import tech.ada.biblioteca.fisica.BibliotecaServiceFisicaImpl;
import tech.ada.biblioteca.model.ItemCatalogo;
import tech.ada.biblioteca.model.Livro;
import tech.ada.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.biblioteca.virtual.BibliotecaServiceVirtual;
import tech.ada.biblioteca.virtual.BibliotecaServiceVirtualImpl;

public class MainBiblioteca {

    public static void main(String[] args) {

        ItemCatalogo livroabc = new Livro("livro abc");

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        System.out.println("cadastrando na biblioteca fisica");
        bibServiceFisica.cadastrar( livroabc );
        System.out.println();
        System.out.println("consultando na biblioteca fisica");
        bibServiceFisica.consultar( livroabc );

        System.out.println();
        System.out.println("consultando na biblioteca fisica pelo titulo");
        boolean r1 = bibServiceFisica.consultar( "livro abs" );
        System.out.println("consultando na biblioteca fisica pelo titulo");
        boolean r2 = bibServiceFisica.consultar("livro abc");
        System.out.println(r1 + " "+ r2);

        System.out.println("emprestando na biblioteca fisica");
        bibServiceFisica.emprestar( livroabc );

        bibServiceFisica.emprestar( livroabc );

        System.out.println("devolvendo na biblioteca fisica");
        bibServiceFisica.devolver(livroabc);

        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl();
        bibServiceVirtual.reservar();

    }

}
