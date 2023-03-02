package ExercicioSistemaDeCompras;

public class ItemDeCompra {

    private int quantidade;

    private Produto produto;

    public ItemDeCompra(int quantidade, Produto produto) {

        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto prod) {
        this.produto = prod;
    }

    @Override
    public String toString() {
        return "ItemDeCompra: " + "quantidade = " + quantidade + ", produto = " + produto;
    }
    
    

}
