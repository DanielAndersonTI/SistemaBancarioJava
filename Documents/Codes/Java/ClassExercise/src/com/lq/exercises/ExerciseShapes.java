package com.lq.exercises;

public class ExerciseShapes {

    public static void main(String[] args) {
        // Criação de um array de objetos Shape (formas)
        Shape[] shapes = new Shape[8];

        // Inicializando as formas no array
        shapes[0] = new Rectangle(5.0, 4.0); // Retângulo 1
        shapes[1] = new Rectangle(5.0, 5.0); // Retângulo 2 (quadrado)
        
        // Inicializando os quadrados com cores e nomes como null para simplificação
        shapes[2] = new Square(5.0, null, null);
        shapes[3] = new Square(8.0, null, null);
        
        // Inicializando cubos
        shapes[4] = new Cubo(5.0);
        shapes[5] = new Cubo(12.0);
        
        // Inicializando caixas (Box)
        shapes[6] = new Box(12.0, 15.0, 6.0, "Orange", "Box1");
        shapes[7] = new Box(3.0, 4.0, 5.0, "Blue", "Box2");

        // Imprime as formas e seus detalhes
        // A linha abaixo é comentada, pois o método setColor não está sendo utilizado no momento.
        // for (Shape shape : shapes) { shape.setColor("silver"); }

        // Iterando sobre cada forma e verificando se é tridimensional para calcular o volume
        for (Shape shape : shapes) {
            // Verifica se a forma é tridimensional e imprime seu volume
            if (shape instanceof TreeDimensional) {
                TreeDimensional temp = (TreeDimensional) shape;
                System.out.println("Volume: " + temp.getVolume());
            }
        }

        // Criação de um array para formas bidimensionais (TwoDimensional)
        TwoDimensional[] twoDs = new TwoDimensional[3];

        // Inicializando formas bidimensionais: círculo, retângulo e quadrado
        twoDs[0] = new Circle(7.0);
        twoDs[1] = new Rectangle(5.0, 4.0); // Retângulo
        twoDs[2] = new Square(5.67, null, null); // Quadrado

        // Imprime a área e o perímetro de cada forma bidimensional
        for (TwoDimensional temp : twoDs) {
            System.out.println("Área: " + temp.getArea());
            System.out.println("Perímetro: " + temp.getPerimetro());
        }
    }
}

