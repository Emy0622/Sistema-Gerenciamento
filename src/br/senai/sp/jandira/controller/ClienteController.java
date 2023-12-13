package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente novoCliente) {
        Cliente cliente = new Cliente();
        cliente.cadastrarCliente();
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        System.out.println("/- Lista de Clientes -/");
        for (Cliente cliente : clientes) {
            exibirInformacoesCliente(cliente);
            System.out.println("----------------------------");
        }
    }

    public void pesquisarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o CPF do cliente: ");
        String cpfPesquisa = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfPesquisa)) {
                exibirInformacoesCliente(cliente);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void deletarCliente(String nomeDeleteCliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF do cliente: ");
        String cpfDeletar = scanner.nextLine();
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpfDeletar)) {
                iterator.remove();
                System.out.println("Cliente deletado com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    private void exibirInformacoesCliente(Cliente cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("CPF: " + cliente.getCpf());
    }

    public void consultarCliente(String nomePesquisadoCliente) {
        // Implementar lógica de consulta
    }

    public void editarCliente(String nomeCliente, String novoSobrenomeCliente) {
        // Implementar lógica de edição
    }
}
