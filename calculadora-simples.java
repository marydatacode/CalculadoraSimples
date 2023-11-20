import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Simples");
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão):");
        int escolha = scanner.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = somar(numero1, numero2);
                break;
            case 2:
                resultado = subtrair(numero1, numero2);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                break;
            case 4:
                resultado = dividir(numero1, numero2);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }

    static double somar(double a, double b) {
        return a + b;
    }

    static double subtrair(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }
}
