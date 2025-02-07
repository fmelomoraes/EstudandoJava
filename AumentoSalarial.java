package ProjetosIniciaisSimples;

import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("    Iremos cálcular o seu aumento salarial ;) ");

        System.out.println(" Digite o seu salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Porcentagem de aumento: ");
        double porcentagemAumento = scanner.nextDouble();


        double aumentoSalarial = salarioAtual*porcentagemAumento / 100;

        System.out.println(" O Aumento foi de: "+aumentoSalarial+" Reais");
    }
}
