package ProjetosIniciaisSimples;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int numero01 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int numero02 = scanner.nextInt();

        System.out.println("Escolha a operação desejada: ");
        System.out.println("1. Soma: ");
        System.out.println("2. Subtração: ");
        System.out.println("3. Multiplicação: ");
        System.out.println("4. Divisão: ");
        System.out.println("5. Módulo: ");

        int escolha = scanner.nextInt();
        int resultado = 0;
        boolean operacaoValida = true;

        switch (escolha) {
            case 1:
                resultado = numero01 + numero02;
                System.out.println("Resultado da soma: "+ resultado);
                break;
            case 2:
                resultado = numero01 - numero02;
                System.out.println("Resultado da subtração: "+resultado);
                break;
            case 3:
                resultado = numero01 * numero02;
                System.out.println("Resultado da multiplicação: "+resultado);
                break;
            case 4:
                resultado = numero01 / numero02;
                System.out.println("Resultado da divisão: "+resultado);
                break;
            case 5:
                resultado = numero01 % numero02;
                System.out.println("Resultado do módulo: "+resultado);
                break;

            default:
                System.out.println("Operação inválida! ");
                operacaoValida = false;
                break;

        }


        scanner.close();




    }
}
