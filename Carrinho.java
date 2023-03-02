package ExercicioSistemaDeCompras;

import java.util.*;

public class Carrinho {

    private List<ItemDeCompra> itens;
    private Cliente cliente;

    public Carrinho(Cliente cliente) {

        this.cliente = cliente;
        itens = new ArrayList<>();
    }

    public void adicionar(Produto prod, int qtd) {

        ItemDeCompra item = new ItemDeCompra(qtd, prod);
        item.setProduto(prod);
        item.setQuantidade(qtd);

        itens.add(item);

    }

    public void remover(Produto prod, int qtd) {

        for (ItemDeCompra testeItens : itens) {

            if (testeItens.getProduto().equals(prod)) {

                int novaQtd = testeItens.getQuantidade() - qtd;

                if (novaQtd <= 0) {

                    eliminar(prod);
                } else {

                    testeItens.setQuantidade(testeItens.getQuantidade() - qtd);
                }

            }
        }
    }

    public void eliminar(Produto prod) {

        ItemDeCompra eliminarItem = null;
        for (ItemDeCompra testeItens : itens) {
            if (testeItens.getProduto().equals(prod)) {
                eliminarItem = testeItens;
            }
        }
        if (eliminarItem != null) {
            itens.remove(eliminarItem);
        }

    }

    public double calcularTotal() {
        double total = 0;

        for (ItemDeCompra itemTeste : itens) {

            double valorTotalItem = itemTeste.getProduto().getPreco() * itemTeste.getQuantidade();

            total += valorTotalItem;
        }

        return total;
    }

    public ItemDeCompra buscarItem(Produto prod) {

        for (ItemDeCompra itemTeste : itens) {
            if (itemTeste.getProduto().equals(prod)) {

                return itemTeste;
            }
        }

        return null;

    }

    public List<ItemDeCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemDeCompra> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Carrinho: " + "itens = " + itens;
    }

}
