package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;


import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    ClienteController clienteController = new ClienteController();
    ProdutoController produtoController = new ProdutoController();

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("/-        Bem Vindo         -/");
            System.out.println("------------------------------");
            System.out.println("-            Menu            -");
            System.out.println("------------------------------");
            System.out.println("0 - Editar Cliente        ");
            System.out.println("1 - Cadastrar Cliente     ");
            System.out.println("2 - Listar Clientes       ");
            System.out.println("3 - Deletar Cliente       ");
            System.out.println("4 - Consultar Cliente     ");
            System.out.println("5 - Sair                  ");
            System.out.println("------------------------------");

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Qual o nome do cliente que deseja alterar: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Informe o novo sobrenome: ");
                    String novoSobrenomeCliente = scanner.nextLine();
                    clienteController.editarCliente(nomeCliente, novoSobrenomeCliente);
                    break;
                case 1:
                    Cliente novoCliente = new Cliente();
                    novoCliente.cadastrarCliente();
                    clienteController.cadastrarCliente(novoCliente);
                    break;
                case 2:
                    System.out.println("/-    Listar Clientes   -/");
                    clienteController.listarClientes();
                    break;
                case 3:
                    System.out.println("Informe o nome do ex-cliente: ");
                    String nomeDeleteCliente = scanner.nextLine();
                    clienteController.deletarCliente(nomeDeleteCliente);
                    break;
                case 4:
                    System.out.println("Informe o nome que deseja pesquisar: ");
                    String nomePesquisadoCliente = scanner.nextLine();
                    clienteController.consultarCliente(nomePesquisadoCliente);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.executarMenu();
    }
}
