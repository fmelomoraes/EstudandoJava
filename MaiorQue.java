package OperadoresRelacionais;

/*
Primeira etapa:
Exercício 1:
Escreva um programa que compare dois números inteiros e imprima se o primeiro é maior, menor ou igual ao segundo.

Segunda Etapa:
 Exercício 2:
Modifique o programa acima para pedir ao usuário que insira dois números e, em seguida, compare-os.
 */

import java.util.Scanner;

public class MaiorQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira Dois números inteiros: ");

        System.out.println("Primeiro número: ");
        int num01 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int num02 = scanner.nextInt();

        if (num01 > num02){
            System.out.println("O número "+num01+" é maior que o número "+num02);
        } else if (num01 == num02) {
            System.out.println("O numero "+num01+" é igual ao número "+num02);
        }
        else{
        System.out.println("O número "+num01+" é menor que o número "+num02);
        }
        scanner.close();
    }


}
