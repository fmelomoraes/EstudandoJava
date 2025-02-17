package OperadoresRelacionais;

/*
Exercício 3:
Escreva um programa que verifique se um número dado está dentro de um determinado intervalo. Por exemplo, verifique se um número está entre 1 e 100.
*/

import java.util.Scanner;

public class VerificarIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 100){
            System.out.println("O número está dentro do intervalo de 1 a 100");
        } else {
            System.out.println("O número está fora do intervalo de 1 a 100");


        }
        System.out.println("Seu numero é: "+numero+" ...obrigado por participar ;)");

        scanner.close();

    }
}
