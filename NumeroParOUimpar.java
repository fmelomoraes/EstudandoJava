package ProjetosIniciaisSimples;

import java.util.Scanner;

public class NumeroParOUimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos conferir se o número e Para ou Ímpar ");

        System.out.println("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario % 2 == 0){
            System.out.println("O número é PAR!");
        }else
        {
            System.out.println("É um número ÍMPAR! ");
        }

    }
}
