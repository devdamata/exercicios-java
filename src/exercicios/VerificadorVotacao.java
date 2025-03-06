package exercicios;

import java.util.Scanner;

public class VerificadorVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println(nome + ", você não pode votar.");
        } else if (idade < 18 || idade >= 65) {
            System.out.println(nome + ", seu voto é opcional.");
        } else {
            System.out.println(nome + ", seu voto é obrigatório.");
        }

        scanner.close();
    }
}
