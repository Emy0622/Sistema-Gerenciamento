package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    private String nome, email, cpf;
    private int idade;

    Scanner scanner = new Scanner(System.in);

    public Cliente() {
    }

    public Cliente(String nome, int idade, String email, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }

    public void cadastrarCliente() {
        System.out.println("/-     Cadastro Cliente     -/");
        System.out.println("Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe a idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        System.out.println("Informe o email: ");
        this.email = scanner.nextLine();
        System.out.println("Informe o CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Cadastro local efetuado...");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
