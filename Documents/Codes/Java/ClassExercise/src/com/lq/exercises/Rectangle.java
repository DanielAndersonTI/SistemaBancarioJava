package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {

    // Definição dos atributos de comprimento e largura
    private double largura;
    private double comprimento;

    // Construtor para inicializar o comprimento e a largura com valores padrão para name e color
    public Rectangle(double comprimento, double largura) {
        this(comprimento, largura, "Unknown", "White");
    }

    // Construtor com parâmetros para inicializar comprimento, largura, name e color
    public Rectangle(double comprimento, double largura, String name, String color) {
        // Chama o construtor da classe pai (Shape)
        super();
        // Configura os valores dos atributos
        setComprimento(comprimento);
        setLargura(largura);
        setName(name);
        setColor(color);
    }

    /**
     * Método para obter o valor de largura.
     * 
     * @return o valor da largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * Método para definir o valor de largura.
     * 
     * @param largura o valor da largura a ser definido
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * Método para obter o valor de comprimento.
     * 
     * @return o valor do comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * Método para definir o valor de comprimento.
     * 
     * @param comprimento o valor do comprimento a ser definido
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Calcula a área do retângulo.
     * 
     * @return a área do retângulo
     */
    @Override
    public double getArea() {
        return comprimento * largura;
    }

    /**
     * Calcula o perímetro do retângulo.
     * 
     * @return o perímetro do retângulo
     */
    @Override
    public double getPerimetro() {
        return (comprimento + largura) * 2;
    }

    /**
     * Retorna uma representação em formato de string do objeto Rectangle.
     * 
     * @return uma string representando o retângulo
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rectangle [comprimento=");
        builder.append(comprimento);
        builder.append(" , largura=");
        builder.append(largura);
        builder.append(" , getColor()=");
        builder.append(getColor());
        builder.append(" , getName()=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }
}
