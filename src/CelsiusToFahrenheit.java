import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Fechando o Scanner para evitar vazamentos de recursos
        scanner.close();

        // Convertendo Celsius para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibindo a temperatura em Fahrenheit com casas decimais
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", temperaturaFahrenheit);

        // Exibindo a temperatura em Fahrenheit sem casas decimais
        int temperaturaFahrenheitInt = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit (sem casas decimais) é: " + temperaturaFahrenheitInt + "°F");
    }
}

