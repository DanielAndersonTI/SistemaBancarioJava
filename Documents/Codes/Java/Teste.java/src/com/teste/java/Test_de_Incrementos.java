package com.teste.java;

import java.util.Scanner;

public class Test_de_Incrementos {

    public static void main(String[] args) {
        
        // Testando incrementos e decrementos (comentado)
        /*
        int x = 10;
        int result = 0;
        // Testando incrementos e decrementos
        System.out.println("Este é o valor inicial de result: " + result);
        result = --x;
        System.out.println("Este é o valor de x após o incremento: " + x);
        System.out.println("Este é o valor de result após o incremento: " + result);
        */

        // Teste de condicional ternária
        int y = 14;
        String b;

        // Exemplo de condicional ternária
        /*
        b = (y == 10) ? "Se sim, o valor de b será 10" : "Se este valor apareceu, significa que o valor de b é diferente de 10";
        System.out.println("O valor de b é: " + b);

        b = (y < 13) ? "Se esta mensagem apareceu, significa que y é menor que 13, então o valor de b será 12, ou seja, o valor de y." : "Se este valor apareceu, significa que y é maior ou igual a 13";
        System.out.println("O valor de b é: " + b);
        */

        // Testando encadeamento de condicionais ternárias
        // y será a hora que a pessoa chegou. O valor dentro da condicional será o horário que a pessoa deverá chegar.
        /*
        b = (y > 14) ? "Você está atrasado!" : (y < 14) ? "Você está adiantado" : "Você está no horário";
        System.out.println("Seu status é: " + b);
        */

        // Usando o Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        String nome;
        
        // Solicitando o nome ao usuário
        System.out.println("Digite um nome ou 's' para sair:");
        nome = entrada.nextLine();
        
        // Loop para repetir até o usuário digitar "s" para sair
        while (!nome.equals("s")) {
            System.out.println("Bem-vindo, " + nome);
            System.out.println("Digite outro nome ou 's' para sair:");
            nome = entrada.nextLine();
        }
        
        // Finaliza a execução
        System.out.println("Fim da execução!");

        // Fecha o Scanner para evitar vazamento de recursos
        entrada.close();
    }
}
