package ExcecoesPersonalizadas;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        try{
            conta.sacar(500.0); // Saque válido
            System.out.println("Saldo após saque: R$ " + conta.getSaldo());

            conta.sacar(600.0); // Vai lançar a exceção
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Operações finalizadas.");
    }
}
