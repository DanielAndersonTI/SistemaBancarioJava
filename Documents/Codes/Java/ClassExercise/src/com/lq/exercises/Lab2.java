
 
package com.lq.exercises;

public class Lab2 {

    public static void main(String[] args) {
        
        // Declaração das variáveis
        int width, height, area;
        double radius = 10.0;
        double pi = 3.14;
        boolean result = true;

        // Nomes dos meses
        String[] monthNames = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", 
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Número de dias em cada mês
        int[] daysInMonths = new int[12];
        daysInMonths[0] = 31; // Janeiro
        daysInMonths[1] = 28; // Fevereiro
        daysInMonths[2] = 31; // Março
        daysInMonths[3] = 30; // Abril
        daysInMonths[4] = 31; // Maio
        daysInMonths[5] = 31; // Junho
        daysInMonths[6] = 30; // Julho
        daysInMonths[7] = 31; // Agosto
        daysInMonths[8] = 30; // Setembro
        daysInMonths[9] = 31; // Outubro
        daysInMonths[10] = 30; // Novembro
        daysInMonths[11] = 31; // Dezembro
        
        // Atribuindo valores às variáveis
        width = 8;
        height = 12;
        area = 96;

        // Imprimindo a saudação inicial
        System.out.println("Hello World");

        // Imprimindo os valores das variáveis
        System.out.println("The Value of width is: " + width);
        System.out.println("The Value of height is: " + height);
        System.out.println("The Value of area is: " + area);
        System.out.println("The Value of radius is: " + radius);
        System.out.println("The Value of pi is: " + pi);
        System.out.println("The Value of result is: " + result);
        
        // Imprimindo o número de dias de cada mês
        for (int i = 0; i < monthNames.length; i++) {
            System.out.println(monthNames[i] + " has " + daysInMonths[i] + " days");
        }
    }
}

