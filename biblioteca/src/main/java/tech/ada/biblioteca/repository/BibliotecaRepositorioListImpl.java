package tech.ada.biblioteca.repository;


import tech.ada.biblioteca.model.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public void
    cadastrar(ItemCatalogo item) {
        itens.add(item);
    }

    @Override
    public boolean consultar(String titulo) {
        if (this.itens == null || itens.isEmpty()) return false;
        for (ItemCatalogo item: this.itens) {
            // aqui vai dar certo a comparacao, mas nao eh uma boa pratica
            //if (item.getTitulo().equals(itemCatalogo.getTitulo()))
            //    return true;
            // forma correta
            if (item.getTitulo().equals(titulo)) // implementada dentro ItemCatalogo
                return true;
        }
        return false;
    }


    public void consultar(ItemCatalogo item) {
        if (itens.isEmpty() || this.itens == null)
            System.out.println("Nenhum item cadastrado");
        else {
            for (ItemCatalogo catalogoItem : this.itens) {
                if (catalogoItem.equals(item))
                    System.out.println("Item encontrado: " + item);
            }
        }

    }

    @Override
    public void emprestar(ItemCatalogo item) {
        if (itens.isEmpty() || this.itens == null)
            System.out.println("Nenhum item cadastrado");
        else {
            for (ItemCatalogo catalogoItem : this.itens) {
                if (catalogoItem.equals(item))
                    System.out.println("Item emprestado: " + item);
            }
        }
    }

    @Override
    public void devolver(ItemCatalogo item) {
        if (itens.isEmpty() || this.itens == null)
            System.out.println("Nenhum item cadastrado");
        else {
            for (ItemCatalogo catalogoItem : this.itens) {
                if (catalogoItem.equals(item))
                    System.out.println("Item devolvido: " + item);
            }
        }

    }


}


