package ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Corrigido o tipo de scanner
        int opcao;

        System.out.println("=== Conversor de Temperatura ===");

        System.out.print("Digite a temperatura: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a escala (C, F ou K): ");
        char escala = scanner.next().toUpperCase().charAt(0);  // Corrigido para usar scanner.next()

        System.out.println("Escolha a conversão: 1 para Fahrenheit, 2 para Kelvin");
        opcao = scanner.nextInt();  // Adicionada a entrada da opção

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

        scanner.close();  // Fechar o scanner após o uso
    }
}