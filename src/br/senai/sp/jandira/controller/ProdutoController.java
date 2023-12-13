package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Produto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto() {
        Produto produto = new Produto() {
            @Override
            public void cadastrarProduto() {

            }
        };
        produto.cadastrarProduto();
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        System.out.println("/- Lista de Produtos -/");
        for (Produto produto : produtos) {
            exibirInformacoesProduto(produto);
            System.out.println("----------------------------");
        }
    }

    private void exibirInformacoesProduto(Produto produto) {
        System.out.println("ID: " + produto.getIdProduto());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }

    // Outros métodos conforme necessário
}
