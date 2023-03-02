package ExercicioSistemaDeCompras;

import java.util.*;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;
    private byte imagem;
    private String codigo;

    public Produto(String nome, String descricao, double preco, String codigo) {

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public byte getImagem() {
        return imagem;
    }

    public void setImagem(byte imagem) {
        this.imagem = imagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto: " + "nome = " + nome + ", descricao = " + descricao + ", preco = " + preco + ", codigo = " + codigo;
    }
    
    

}
