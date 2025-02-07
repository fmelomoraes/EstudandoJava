package ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=== Conversor de Temperatura ===");

        System.out.print("Digite a temperatura: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a escala (C, F ou K): ");
        char escala = scanner.next().toUpperCase().charAt(0);

        System.out.println("Escolha a conversão: 1 para Fahrenheit, 2 para Kelvin");
        opcao = scanner.nextInt();

        Temperatura temperatura = new Temperatura(valor, escala);

        switch (opcao){
            case 1:
                System.out.println("Convertido para Fahrenheit: " + temperatura.converteParaFahrenheit());
                break;
            case 2:
                System.out.println("Convertido para Kelvin: " + temperatura.converteParaKelvin());
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
