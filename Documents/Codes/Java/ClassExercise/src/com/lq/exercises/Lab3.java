package com.lq.exercises;

public class Lab3 {

    public static void main(String[] args) {
        
        // Definindo os arrays para os dias da semana e meses
        String[] diasdaSemana =  {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};  
        String[] diasdasemanaInverso =  {"Sábado", "Sexta", "Quinta", "Quarta", "Terça", "Segunda", "Domingo"};
        String[] monthNames = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", 
                               "Setembro", "Outubro", "Novembro", "Dezembro"}; 
        
        // Imprimindo os dias da semana
        System.out.println("Iniciará com os dias da Semana\n");
        for (int i = 0; i < diasdaSemana.length; i++) {
            System.out.println(diasdaSemana[i]);
        }
        
        // Apresentando os dias com o "for" aprimorado
        System.out.println("\nApresentará os dias com o For aprimorado\n");
        for (String dia : diasdaSemana) {
            System.out.println(dia);
        }
        
        // Apresentando os dias na forma inversa
        System.out.println("\nApresentará os dias na forma inversa\n");
        for (int d = 0; d < diasdasemanaInverso.length; d++) {
            System.out.println(diasdasemanaInverso[d]);
        }
        
        // Imprimindo pares de 2 a 20
        System.out.println("\nApresentará apenas pares de 2 a 20\n");
        int pares = 0;
        while (pares <= 20) {
            pares++;
            if (pares % 2 == 1) { // Ignorando números ímpares
                continue;
            }
            System.out.println(pares);
        }
        
        // Imprimindo de 1 até 100, exceto o intervalo de 50 a 60
        System.out.println("\nIrá imprimir de 1 até 100, menos no intervalo de 50 a 60");
        for (int k = 1; k <= 100; k++) {
            if (k > 49 && k < 61) { // Ignorando o intervalo entre 50 e 60
                continue;
            }
            System.out.println(k);
        } 
        
        // Exemplo de switch com o número dos meses
        System.out.println("\nIniciará o Exercicio 4 com o Switch\n");
        int numerodemeses = 1;
        while (numerodemeses <= 12) {
            switch (numerodemeses) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("O mês de " + monthNames[numerodemeses - 1] + " tem 31 dias.\n");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("O mês de " + monthNames[numerodemeses - 1] + " tem 30 dias.\n");
                    break;
                case 2:
                    System.out.println("O mês de " + monthNames[numerodemeses - 1] + " tem 28 dias.\n");
                    break;
                default:
                    System.out.println("\nErro! O número não está entre 1 e 12\n");
            }
            numerodemeses++;
        }
        
        // Imprimindo o calendário do mês de Março
        System.out.println("\nCalendário do Mês de Março\n");
        int esquerdo = 4; // Começando a imprimir a partir do dia 4 (quarta-feira)
        boolean imprime = false;
        int contagemdedias = 1;
        
        // Imprimindo cabeçalho do calendário
        System.out.println("Dom  Seg  Ter  Qua  Qui  Sex  Sáb");
        
        // Loop para imprimir o calendário
        for (int y = 0; y < 5; y++) { 
            for (int x = 0; x < 7; x++) {
                if (!imprime) {
                    System.out.print("     "); // Espaços antes do primeiro dia
                    if (x == esquerdo) {
                        imprime = true; // Começa a imprimir o primeiro dia
                    }
                } else if (contagemdedias < 10) {
                    System.out.print(contagemdedias + "    "); // Imprimindo números de 1 a 9 com espaçamento
                    contagemdedias++;
                } else {
                    System.out.print(contagemdedias + "   "); // Imprimindo números maiores que 9
                    contagemdedias++;
                }
            }
            System.out.println(); // Mudando linha a cada semana
        }
    }
}


