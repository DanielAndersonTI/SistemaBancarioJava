// Define o pacote onde a classe CalculadoraTrigonometrica está localizada
package com.javaoo.calculadora;

// Define a classe CalculadoraTrigonometrica
public class CalculadoraTrigonometrica {

    // Método para calcular o seno de um ângulo em radianos
    public double seno(double value) {
        return (Math.sin(value));  // Retorna o seno de 'value'
    }

    // Método para calcular o cosseno de um ângulo em radianos
    public double cosseno(double value) {
        return (Math.cos(value));  // Retorna o cosseno de 'value'
    }

    // Método para calcular a tangente de um ângulo em radianos
    public double tangent(double value) {
        return (Math.tan(value));  // Retorna a tangente de 'value'
    }

    // Método para calcular o arco seno (inverso do seno) de um valor
    public double arcoseno(double value) {
        return (Math.asin(value));  // Retorna o arco seno de 'value'
    }

    // Método para calcular o arco cosseno (inverso do cosseno) de um valor
    public double arcocosseno(double value) {
        return (Math.acos(value));  // Retorna o arco cosseno de 'value'
    }

    // Método para calcular o arco tangente (inverso da tangente) de um valor
    public double arcotangent(double value) {
        return (Math.atan(value));  // Retorna o arco tangente de 'value'
    }
}

