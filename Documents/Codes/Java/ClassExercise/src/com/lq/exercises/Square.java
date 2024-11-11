package com.lq.exercises;

public class Square extends Rectangle {

    /**
     * Construtor da classe Square que chama o construtor da classe Rectangle.
     * Como um quadrado tem lados iguais, o comprimento e a largura são ambos definidos como o lado.
     * 
     * @param side o valor do lado do quadrado
     * @param string o nome (herdado de Rectangle)
     * @param string2 a cor (herdado de Rectangle)
     */
    public Square(double side, String string, String string2) {
        // Chama o construtor da classe pai (Rectangle) com comprimento e largura iguais
        super(side, side, string, string2);
    }

}
