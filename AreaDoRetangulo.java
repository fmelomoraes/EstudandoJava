package ProjetosIniciaisSimples;

import java.util.Scanner;

public class AreaDoRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("        Vamos cálcular a área do triângulo");
        System.out.println(">> Sou um sistema simples, insira apenas números sem . e ,");

        System.out.println("Insira a largura do triângulo: ");
        double largura = scanner.nextInt();

        System.out.println("Agora a altura: ");
        double altura = scanner.nextInt();

        double area = largura * altura;

        System.out.println("Essa é a área do seu triângulo: "+ area);

        scanner.close();
    }
}
