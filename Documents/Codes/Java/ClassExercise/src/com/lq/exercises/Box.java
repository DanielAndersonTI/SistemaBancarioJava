package com.lq.exercises;

/**
 * A classe `Box` representa uma caixa tridimensional.
 * Ela herda de `Shape` e implementa a interface `TwoDimensional`.
 * A caixa tem três dimensões: comprimento, largura e altura.
 * Além disso, pode calcular seu volume e área da superfície.
 */
public class Box extends Shape implements TwoDimensional {

    // Atributos da classe Box
    private double altura = 1;
    private double largura = 1;
    private double comprimento = 1;

    /**
     * Construtor da classe Box que recebe as dimensões específicas da caixa.
     * Verifica se as dimensões são maiores que zero e as define.
     * 
     * @param comprimento A dimensão do comprimento da caixa.
     * @param largura A dimensão da largura da caixa.
     * @param altura A dimensão da altura da caixa.
     */
    public Box(double comprimento, double largura, double altura) {
        super();
        // Verifica se as dimensões são positivas e as define
        if (comprimento > 0)
            this.comprimento = comprimento;
        if (largura > 0)
            this.largura = largura;
        if (altura > 0)
            this.altura = altura;
    }

    /**
     * Construtor da classe Box que assume que todas as dimensões são iguais (cubo).
     * 
     * @param lado O tamanho do lado (para um cubo).
     */
    Box(double lado) {
        this(lado, lado, lado);
    }

    /**
     * Construtor da classe Box que recebe dimensões e informações adicionais (cor e nome).
     * 
     * @param comprimento A dimensão do comprimento da caixa.
     * @param largura A dimensão da largura da caixa.
     * @param altura A dimensão da altura da caixa.
     * @param color Cor da caixa.
     * @param name Nome da caixa.
     */
    public Box(double comprimento, double largura, double altura, String color, String name) {
        this(comprimento, largura, altura);  // Chama o construtor anterior
        setColor(color);  // Define a cor
        setName(name);    // Define o nome
    }

    // Métodos de acesso (Getters e Setters) para os atributos

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Calcula o volume da caixa.
     * O volume é dado pela multiplicação das três dimensões: altura, largura e comprimento.
     * 
     * @return O volume da caixa.
     */
    public double getVolume() {
        return (altura * largura * comprimento);
    }

    /**
     * Calcula a área da superfície da caixa.
     * A área da superfície é a soma das áreas de todas as faces da caixa.
     * 
     * @return A área da superfície da caixa.
     */
    public double getSurfaceArea() {
        return ((largura * comprimento + comprimento * altura + altura * largura) * 2);
    }

    /**
     * Método para imprimir as informações da caixa.
     * Verifica se as dimensões são válidas e imprime os detalhes da caixa.
     */
    public void printBox() {
        if (largura <= 0 || comprimento <= 0 || altura <= 0) {
            System.out.println("Os parâmetros desta caixa são inválidos");
        } else {
            System.out.println("Comprimento = " + comprimento);
            System.out.println("Altura = " + altura);
            System.out.println("Largura = " + largura);
            System.out.println("Volume = " + getVolume());
            System.out.println("Área da Superfície = " + getSurfaceArea());
        }
    }

    // Métodos obrigatórios da interface TwoDimensional (mas não usados na Box)

    @Override
    public double getArea() {
        // A classe Box não implementa área bidimensional diretamente
        return 0;
    }

    @Override
    public double getPerimetro() {
        // A classe Box não implementa perímetro bidimensional diretamente
        return 0;
    }

    /**
     * Método toString sobrescrito para retornar uma representação em String da caixa.
     * 
     * @return Uma String representando os atributos da caixa.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Box [comprimento=");
        builder.append(comprimento);
        builder.append(" , largura=");
        builder.append(largura);
        builder.append(" , altura=");
        builder.append(altura);
        builder.append(" , getColor()=");
        builder.append(getColor());  // Assume que a classe Shape tem o método getColor()
        builder.append(" , getName()=");
        builder.append(getName());   // Assume que a classe Shape tem o método getName()
        builder.append("]");
        return builder.toString();
    }
}


