/**
 * Pacote onde a classe Calculator_Driver está localizada.
 */
package com.javaoo.calculadora;

/**
 * Classe principal para testar as funcionalidades das calculadoras básica, científica e trigonométrica.
 */
public class Calculator_Driver {

    /**
     * Método principal que executa o programa.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste caso)
     */
    public static void main(String[] args) {
        
        // Cria uma instância da CalculadoraBasica e realiza operações básicas
        CalculadoraBasica cb = new CalculadoraBasica();
        System.out.println("7 + 7 = " + cb.adicao(7, 7));          // Realiza e exibe a adição
        System.out.println("7 - 7 = " + cb.subtrair(7, 7));        // Realiza e exibe a subtração
        System.out.println("7 * 7 = " + cb.multiplicar(7, 7));     // Realiza e exibe a multiplicação
        System.out.println("7 / 7 = " + cb.dividir(7, 7));         // Realiza e exibe a divisão

        // Cria uma instância da CalculadoraCientifica e realiza operações científicas
        CalculadoraCientifica cc = new CalculadoraCientifica();
        System.out.println("Expoente de 20 é: " + cc.exp(20));         // Calcula e exibe e^20
        System.out.println("Logaritmo de 100 é: " + cc.log(100));      // Calcula e exibe o logaritmo de 100
        cc.putvaluenamemoria(23.5);                                    // Armazena o valor 23.5 na "memória"
        System.out.println("O valor na memoria é: " + cc.getvalueforadamemoria());  // Recupera e exibe o valor armazenado

        // Cria uma instância da CalculadoraTrigonometrica e realiza operações trigonométricas
        CalculadoraTrigonometrica ct = new CalculadoraTrigonometrica();
        System.out.println("Seno de .523 é: " + ct.seno(.523));                  // Calcula e exibe o seno de 0.523 radianos
        System.out.println("Cosseno de .523 é: " + ct.cosseno(.523));            // Calcula e exibe o cosseno de 0.523 radianos
        System.out.println("Tangente de .523 é: " + ct.tangent(.523));           // Calcula e exibe a tangente de 0.523 radianos
        System.out.println("Arco-Seno de .523 é: " + ct.arcoseno(.523));         // Calcula e exibe o arco seno de 0.523
        System.out.println("Arco-Cosseno de .523 é: " + ct.arcocosseno(.523));   // Calcula e exibe o arco cosseno de 0.523
        System.out.println("Arco-Tangente de .523 é: " + ct.arcotangent(.523));  // Calcula e exibe o arco tangente de 0.523
    }
}

