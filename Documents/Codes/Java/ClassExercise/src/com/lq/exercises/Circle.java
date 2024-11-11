package com.lq.exercises;

// A classe `Circle` representa uma forma geométrica de círculo e implementa a interface `TwoDimensional`.
// Ela possui métodos para calcular a área, o perímetro e informações do círculo como o raio, cor e nome.
public class Circle extends Shape implements TwoDimensional {

    // Correção: O valor de PI estava errado. O valor correto de PI é 3.14159.
    private static final double PI = 3.14159;
    
    private double radius;

    /**
     * Construtor padrão para criar um círculo com um raio específico.
     * A cor e o nome são definidos como "White" e "Unknown", respectivamente.
     * 
     * @param radius O raio do círculo.
     */
    public Circle(double radius) {
        // Chama o construtor com todos os parâmetros, definindo cor e nome padrão
        this(radius, "White", "Unknown");
    }

    /**
     * Construtor para criar um círculo com um raio, cor e nome específicos.
     * 
     * @param radius O raio do círculo.
     * @param color A cor do círculo.
     * @param name O nome do círculo.
     */
    public Circle(double radius, String color, String name) {
        // Define o raio, cor e nome utilizando os setters
        setRadius(radius);
        setColor(color);
        setName(name);
    }

    /**
     * Calcula e retorna a área do círculo.
     * A fórmula usada é: Área = PI * raio^2.
     * 
     * @return A área do círculo.
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Calcula e retorna o perímetro (ou circunferência) do círculo.
     * A fórmula usada é: Perímetro = 2 * PI * raio.
     * 
     * @return O perímetro do círculo.
     */
    @Override
    public double getPerimetro() {
        return 2 * PI * radius;
    }

    /**
     * Obtém o valor do raio do círculo.
     * 
     * @return O raio do círculo.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Define o valor do raio do círculo.
     * 
     * @param radius O valor do raio a ser definido.
     */
    private void setRadius(double radius) {
        // Define o raio, permitindo qualquer valor positivo ou zero
        this.radius = radius;
    }

    /**
     * Retorna uma representação em string do círculo, incluindo seu raio, cor e nome.
     * 
     * @return A string que descreve o círculo.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle [radius=");
        builder.append(radius);
        builder.append(", getColor()=");
        builder.append(getColor());
        builder.append(", getName()=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }
}

