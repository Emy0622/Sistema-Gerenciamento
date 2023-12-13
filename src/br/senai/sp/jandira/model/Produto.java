package br.senai.sp.jandira.model;

import java.util.Scanner;

public abstract class Produto {

    private int idProduto;
    private String nome;
    private double preco;

    Scanner scanner = new Scanner(System.in);

    public Produto() {
    }

    public Produto(int idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void cadastrarProduto();

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}


