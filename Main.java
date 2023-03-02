package ExercicioSistemaDeCompras;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Cliente leo = new Cliente("Leo", 123456789, "leo123");

        List<Produto> bistek = new ArrayList<>();

        Produto uva = new Produto("Uva", "Sem caroço", 2.50, "1m23");
        Produto arroz = new Produto("Arroz", "Branco", 5.00, "78o9");
        Produto feijao = new Produto("Feijão", "Carioca", 4.50, "2g5");
        Produto manga = new Produto("Manga", "Rosa", 0.50, "456l");

        bistek.add(uva);
        bistek.add(arroz);
        bistek.add(feijao);
        bistek.add(manga);

        for (Produto produto : bistek) {

            System.out.println(produto.toString());
        }

        Carrinho modificar = new Carrinho(leo);

        //Adicionar item no carrinho
        modificar.adicionar(uva, 3);
        modificar.adicionar(manga, 1);

        //Buscar Item no carrinho e altera-lo
        //modificar.buscarItem(uva).setQuantidade(10);
        
        //Eliminar item do carrinho
        //modificar.eliminar(uva);
        //Remover item ou qtd do carrinho
        //modificar.remover(uva,2);
        System.out.println("\n" + modificar.toString());
        System.out.println("Suas compras deu um valor total de " + modificar.calcularTotal() + " reais.");

    }

}
