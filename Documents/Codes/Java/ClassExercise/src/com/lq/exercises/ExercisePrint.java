package com.lq.exercises;

public class ExercisePrint {

    public static void main(String[] args) {
        // Criação de um array de formas
        Shape[] shapes = new Shape[5];

        // Inicializa as formas com valores
        shapes[0] = new Rectangle(5.0, 4.0, "Blue", "Rectangle1");
        shapes[1] = new Square(8.0, "Red", "Square1");
        shapes[2] = new Cubo(5.0, "Yellow", "Cubo1");
        shapes[3] = new Box(12.0, 15.0, 6.0, "Orange", "Box1");
        shapes[4] = new Circle(3.0, "Lavender", "Circle1");

        // Imprime as representações das formas
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
