package exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioExcecaoSimples {

    public static void main(String[] args) {
        int a = 0, b = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            a = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            b = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Só é permitido números.");
        }

        try {
            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {

            System.out.println("Bloco 'finally' sempre é executado.");
        }
    }
}
