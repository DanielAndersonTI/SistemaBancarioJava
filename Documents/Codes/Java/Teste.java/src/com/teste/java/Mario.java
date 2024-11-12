package com.teste.java;

import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        int valor;

        // Loop que pede um valor de 1 a 8
        do {
            System.out.println("Digite um valor de 1 a 8: ");
            valor = entrada.nextInt();
        } while (valor < 1 || valor > 8); // Garante que o valor esteja entre 1 e 8

        // Imprime os blocos de hash dependendo do valor inserido
        switch (valor) {
            case 1:
                System.out.println("#");
                break;
            case 2:
                System.out.println(" #");
                System.out.println("##");
                break;
            case 3:
                System.out.println("  #");
                System.out.println(" ##");
                System.out.println("###");
                break;
            case 4:
                System.out.println("   #");
                System.out.println("  ##");
                System.out.println(" ###");
                System.out.println("####");
                break;
            case 5:
                System.out.println("    #");
                System.out.println("   ##");
                System.out.println("  ###");
                System.out.println(" ####");
                System.out.println("#####");
                break;
            case 6:
                System.out.println("     #");
                System.out.println("    ##");
                System.out.println("   ###");
                System.out.println("  ####");
                System.out.println(" #####");
                System.out.println("######");
                break;
            case 7:
                System.out.println("      #");
                System.out.println("     ##");
                System.out.println("    ###");
                System.out.println("   ####");
                System.out.println("  #####");
                System.out.println(" ######");
                System.out.println("#######");
                break;
            case 8:
                System.out.println("       #");
                System.out.println("      ##");
                System.out.println("     ###");
                System.out.println("    ####");
                System.out.println("   #####");
                System.out.println("  ######");
                System.out.println(" #######");
                System.out.println("########");
                break;
            default:
                System.out.println("Valor inválido.");
        }

        // Fecha o scanner para evitar vazamento de recursos
        entrada.close();
    }
}
