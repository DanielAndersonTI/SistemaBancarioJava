package com.gerenciaBanco;

import java.util.Scanner;

// Classe Cliente
class Cliente {
    
    // Atributos privados da classe Cliente
    private String nomecompleto;
    private String cpf;
    private double saldo = 2500; // Saldo inicial do cliente
    
    // Construtor da classe Cliente
    public Cliente(String nomecompleto, String cpf) {
        this.nomecompleto = nomecompleto;
        this.cpf = cpf;
        this.saldo = 2500; // Define o saldo inicial para R$2500
    }

    // Método para consultar o saldo do cliente
    public void consultadesaldo() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    // Método para depositar um valor na conta do cliente
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Adiciona o valor ao saldo
            System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso!");
            System.out.println("Seu novo saldo é de: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    // Método para sacar um valor da conta do cliente
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // Subtrai o valor do saldo
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
            System.out.println("Seu novo saldo é de: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}

// Classe principal que gerencia a interação com o cliente
public class GerenciaBanco {

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        
        // Solicita o nome completo e o CPF do cliente
        System.out.println("Digite seu nome completo: ");
        String nomecompleto = sc1.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc1.nextLine();
        System.out.println("Olá, " + nomecompleto + "!");

        // Cria um objeto Cliente
        Cliente cliente = new Cliente(nomecompleto, cpf);
        
        boolean continuar = true;
        
        // Loop para interação com o cliente
        while (continuar) {
            System.out.println("\nComo podemos lhe ajudar hoje?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valores");
            System.out.println("3 - Sacar valores");
            System.out.println("4 - Encerrar operação");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc1.nextInt();
            
            switch (opcao) {
                case 1:
                    // Chama o método de consulta de saldo
                    cliente.consultadesaldo();
                    break;
                
                case 2:
                    // Solicita o valor para depósito
                    System.out.print("Informe um valor para depositar: R$");
                    double valordeposito = sc1.nextDouble();
                    cliente.depositar(valordeposito);
                    break;
                
                case 3:
                    // Solicita o valor para saque
                    System.out.print("Informe um valor para sacar: R$");
                    double valorsaque = sc1.nextDouble();
                    cliente.sacar(valorsaque);
                    break;
                
                case 4:
                    // Encerra a operação
                    continuar = false;
                    System.out.println("Esta operação está encerrada.");
                    break;
                
                default:
                    // Caso a opção seja inválida
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        
        // Fecha o scanner
        sc1.close();
    }
}
