package com.lq.exercises;

public abstract class Shape {

    // Atributos que representam a cor e o nome da forma
    private String color;
    private String name;

    /**
     * Método para obter o valor da cor da forma.
     * 
     * @return o valor da cor
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para definir o valor da cor da forma.
     * 
     * @param color o valor da cor a ser definido
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para obter o nome da forma.
     * 
     * @return o nome da forma
     */
    public String getName() {
        return name;
    }

    /**
     * Método para definir o nome da forma.
     * 
     * @param name o nome a ser atribuído à forma
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método abstrato para calcular a área da superfície da forma.
     * Esse método precisa ser implementado pelas subclasses que estendem Shape.
     * 
     * @return 0, pois o cálculo específico será definido pelas subclasses
     */
    public double getAreadaSuperficie() {
        // Este método será implementado nas subclasses
        return 0;
    }

    /**
     * Método para retornar uma representação em formato de string da forma.
     * 
     * @return uma string representando a forma com seus atributos
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Shape [color=");
        builder.append(color);
        builder.append(" , name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }
}
