package com.lq.exercises;

public class CuboDriver {

    public static void main(String[] args) {
        // Criação de dois objetos Cubo
        Cubo cubo1 = new Cubo(5);
        Cubo cubo2 = new Cubo(8);

        // Exibe as propriedades do cubo1
        System.out.println("Cubo 1 - Altura: " + cubo1.getAltura());
        System.out.println("Cubo 1 - Largura: " + cubo1.getLargura());
        System.out.println("Cubo 1 - Comprimento: " + cubo1.getComprimento());
        System.out.println();

        // Exibe as propriedades do cubo2
        System.out.println("Cubo 2 - Altura: " + cubo2.getAltura());
        System.out.println("Cubo 2 - Largura: " + cubo2.getLargura());
        System.out.println("Cubo 2 - Comprimento: " + cubo2.getComprimento());
        System.out.println();
        
        // Linha separadora para melhor visualização
        System.out.println("_________________________________________________________");
        System.out.println();

        // Modifica o comprimento do cubo1 e imprime as novas propriedades
        cubo1.setComprimento(20);
        cubo1.printBox();
        System.out.println();

        // Linha separadora para melhor visualização
        System.out.println("_________________________________________________________");

        // Modifica os lados do cubo1 e imprime as novas propriedades
        cubo1.setLados(40);
        cubo1.printBox();
        System.out.println();

        // Linha separadora para melhor visualização
        System.out.println("_________________________________________________________");

        // Tenta definir uma largura negativa para o cubo2 e imprime as propriedades
        cubo2.setLargura(-5);
        cubo2.printBox();
    }
}
