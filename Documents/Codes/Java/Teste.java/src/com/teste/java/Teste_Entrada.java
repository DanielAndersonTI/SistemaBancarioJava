package com.teste.java;

import java.util.Scanner;

public class Teste_Entrada {
    
    // Valor constante usado para cálculo de área
    public static final double EXATA = 74.5;

    public static void main(String[] args) {
        
        // Inicializando o Scanner para capturar entradas do usuário
        Scanner texto = new Scanner(System.in);
        
        // Solicita o nome do usuário
        System.out.println("Adicione um nome: ");
        String letra = texto.nextLine();
        System.out.println("Bem-vindo, " + letra);
        
        // Solicita um valor inteiro
        System.out.println("Digite um valor inteiro: ");
        int valor = texto.nextInt();
        System.out.println("O número digitado foi: " + valor);
        
        // Solicita um valor flutuante (decimal)
        System.out.println("Digite um valor flutuante: ");
        float valor_1 = texto.nextFloat();
        System.out.println("O número digitado foi: " + valor_1);
        
        // Solicita o comprimento e calcula a área com o valor constante
        System.out.println("Entre com o Comprimento: ");
        double comprimento = texto.nextDouble();
        double area = calculoArea(EXATA, comprimento);
        System.out.println("A área é: " + area);
        
        // Fecha o scanner para evitar vazamento de recursos
        texto.close();    
    }
    
    /**
     * Método para calcular a área com base em uma constante e no comprimento fornecido.
     * 
     * @param exata A constante usada no cálculo.
     * @param comprimento O valor do comprimento fornecido pelo usuário.
     * @return O valor da área calculada.
     */
    public static final double calculoArea(double exata, double comprimento) {
        return exata * comprimento;
    }
}
