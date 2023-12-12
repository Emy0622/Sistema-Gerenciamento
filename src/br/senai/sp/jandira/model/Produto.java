package br.senai.sp.jandira.model;

import java.util.Scanner;

abstract class Produto {

    String nome, fornecedor, detalhes, tipo;

    int codigo, quantidade;

    double preco;


    Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionarioProduto() {
        System.out.println("Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o fornecedor: ");
        this.fornecedor = scanner.nextLine();
        System.out.println("Informe o tipo: ");
        this.tipo = scanner.nextLine();
        System.out.println("Informe os detalhes: ");
        this.detalhes = scanner.nextLine();
        System.out.println("Informe o codigo: ");
        this.codigo = scanner.nextInt();
        System.out.println("Informe a quantidade: ");
        this.quantidade = scanner.nextInt();
        System.out.println("Informe o preço: ");
        this.preco = scanner.nextDouble();

    }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getFornecedor() {
            return fornecedor;
        }

        public void setCargo(String fornecedor) {
            this.fornecedor = fornecedor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public int getIdFuncionario() {
            return idFuncionario;
        }

        public void setIdFuncionario(int idFuncionario) {
            this.idFuncionario = idFuncionario;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }


}

}
