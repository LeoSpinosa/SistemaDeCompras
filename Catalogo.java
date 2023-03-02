package ExercicioSistemaDeCompras;

import java.util.*;

public class Catalogo {

    private String titulo;

    private List<Produto> produtos;

    public Catalogo(String titulo) {

        this.titulo = titulo;
        produtos = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
