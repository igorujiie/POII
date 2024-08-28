package tech.ada.biblioteca.fisica;

import tech.ada.biblioteca.model.ItemCatalogo;
import tech.ada.biblioteca.service.BibliotecaService;


public interface BibliotecaServiceFisica extends BibliotecaService {

    void emprestar(ItemCatalogo item);


    void devolver(ItemCatalogo item);
    void cadastrar(ItemCatalogo livroabc);
    void consultar(ItemCatalogo item);

}
