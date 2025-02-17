import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada: ");
        System.out.println("1. Celsius para Fahrenheit ");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1){
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit%n", celsius, fahrenheit);
        } else if (escolha == 2){
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);
            System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius%n\", fahrenheit, celsius");
        } else {
            System.out.println("Escolha inválida! ");
        }
        scanner.close();

    }

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
        }
}
