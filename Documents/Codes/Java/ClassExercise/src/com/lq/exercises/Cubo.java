package com.lq.exercises;

// A classe `Cubo` é uma especialização da classe `Box`, representando um cubo.
// O cubo é um caso especial de caixa onde todos os lados possuem o mesmo comprimento.
public class Cubo extends Box {

    // Variável `numero` não é utilizada, então foi removida.
    // private static double numero;

    /**
     * Construtor para criar um cubo com um lado específico.
     * O cubo é criado com a mesma medida para comprimento, largura e altura.
     * 
     * @param lado O valor do lado do cubo.
     */
    public Cubo(double lado) {
        // Chama o construtor da classe `Box` com o mesmo valor para todos os lados.
        super(lado);
    }

    /**
     * Construtor que aceita um número e uma string para o nome e a cor do cubo.
     * 
     * @param numero O número usado para definir o lado do cubo.
     * @param string A cor do cubo.
     * @param string2 O nome do cubo.
     */
    public Cubo(double numero, String string, String string2) {
        // Chama o construtor de um único lado, passando o número como valor do lado.
        this(numero);
        // Aqui você pode definir a cor e o nome, se necessário, utilizando os métodos setColor e setName.
        setColor(string);
        setName(string2);
    }

    /**
     * Seta o comprimento do cubo. Como todos os lados são iguais, altera todos os lados.
     * 
     * @param comprimento O comprimento que será atribuído ao cubo.
     */
    @Override
    public void setComprimento(double comprimento) {
        // Verifica se o comprimento é diferente do atual
        if (super.getComprimento() != comprimento) {
            // Se for diferente, ajusta todos os lados
            setLados(comprimento);
        }
    }

    /**
     * Seta a largura do cubo. Como todos os lados são iguais, altera todos os lados.
     * 
     * @param largura A largura que será atribuída ao cubo.
     */
    @Override
    public void setLargura(double largura) {
        // Verifica se a largura é diferente da atual
        if (super.getLargura() != largura) {
            // Se for diferente, ajusta todos os lados
            setLados(largura);
        }
    }

    /**
     * Seta a altura do cubo. Como todos os lados são iguais, altera todos os lados.
     * 
     * @param altura A altura que será atribuída ao cubo.
     */
    @Override
    public void setAltura(double altura) {
        // Verifica se a altura é diferente da atual
        if (super.getAltura() != altura) {
            // Se for diferente, ajusta todos os lados
            setLados(altura);
        }
    }

    /**
     * Seta o tamanho de todos os lados do cubo. Como é um cubo, todos os lados devem ser iguais.
     * 
     * @param lados O tamanho do lado do cubo.
     */
    public void setLados(double lados) {
        // Verifica se o valor dos lados é maior que zero
        if (lados > 0) {
            // Define o tamanho de todos os lados do cubo
            super.setComprimento(lados);
            super.setLargura(lados);
            super.setAltura(lados);
        } else {
            // Se o valor for inválido, exibe uma mensagem de erro
            System.err.println("O valor passado deve ser maior que zero - Cubo inalterado");
        }
    }

    /**
     * Retorna o tamanho do lado do cubo.
     * Como todos os lados são iguais, podemos retornar qualquer um dos lados.
     * 
     * @return O tamanho do lado do cubo.
     */
    public double getLados() {
        // O tamanho do lado do cubo é igual à altura, pois todos os lados são iguais
        return super.getAltura();
    }
}

