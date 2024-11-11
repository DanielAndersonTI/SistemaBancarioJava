// Define o pacote onde a classe CalculadoraCientifica está localizada
package com.javaoo.calculadora;

// Define a classe CalculadoraCientifica
public class CalculadoraCientifica {

    // Declara uma constante estática para o valor de PI
    public static final double PI = 3.14159;

    // Declara uma variável privada para armazenar um valor de retenção (memória)
    private double valorderetencao;

    // Método para calcular o exponencial (e^value) de um número
    public final double exp(double value) {
        return (Math.exp(value));  // Retorna o valor exponencial de 'value'
    }

    // Método para calcular o logaritmo natural de um número
    public final double log(double value) {
        return (Math.log(value));  // Retorna o logaritmo natural de 'value'
    }

    // Método para armazenar um valor na memória (valorderetencao)
    public final void putvaluenamemoria(double value) {
        valorderetencao = value;  // Armazena 'value' na variável valorderetencao
    }

    // Método para recuperar o valor armazenado na memória (valorderetencao)
    public final double getvalueforadamemoria() {
        return (valorderetencao);  // Retorna o valor armazenado em valorderetencao
    }
}

