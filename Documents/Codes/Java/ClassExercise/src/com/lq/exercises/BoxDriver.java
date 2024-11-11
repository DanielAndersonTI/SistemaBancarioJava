package com.lq.exercises;

/**
 * A classe `BoxDriver` é responsável por testar a funcionalidade da classe `Box`.
 * Ela cria objetos da classe `Box`, interage com eles e exibe os resultados no console.
 */
public class BoxDriver {

    /**
     * O método main cria e manipula objetos `Box` para testar os métodos da classe `Box`.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        
        // Exercício 1: Criação de objetos Box
        // Criando uma caixa com dimensões específicas (comprimento, largura, altura)
        Box box1 = new Box(5, 6, 7);
        // Criando uma caixa com o mesmo tamanho para todas as dimensões (cubo)
        Box box2 = new Box(10);

        // Exibindo as dimensões da box1
        System.out.println("O comprimento de box 1 é: " + box1.getComprimento());
        System.out.println("A largura de box 1 é: " + box1.getLargura());
        System.out.println("A altura de box 1 é: " + box1.getAltura());

        // Exibindo as dimensões da box2
        System.out.println("O comprimento de box 2 é: " + box2.getComprimento());
        System.out.println("A largura de box 2 é: " + box2.getLargura());
        System.out.println("A altura de box 2 é: " + box2.getAltura());

        // Exercício 2: Testar métodos de negócios
        // Modificando as dimensões de box1
        box1.setComprimento(3);
        box1.setLargura(4);
        box1.setAltura(5);

        // Exibindo as novas dimensões e o cálculo do volume e área da superfície de box1
        System.out.println("O comprimento de box1 é: " + box1.getComprimento());
        System.out.println("A largura de box 1 é: " + box1.getLargura());
        System.out.println("A altura de box 1 é: " + box1.getAltura());
        System.out.println("O volume de box 1 é: " + box1.getVolume());
        System.out.println("A área da superfície de box 1 é: " + box1.getSurfaceArea());

        // Imprimindo detalhes de box1
        box1.printBox();

        // Modificando as dimensões de box1 para valores inválidos e imprimindo os resultados
        box1.setComprimento(-5);
        box1.printBox();

        box1.setLargura(-7);
        box1.setAltura(-3);
        box1.printBox();

        // Exercício de desafio: Criando uma caixa com dimensões inválidas
        Box box3 = new Box(5, -4, 0);
        box3.printBox();
    }
}

