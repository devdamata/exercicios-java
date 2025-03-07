package ExcecoesPersonalizadas;

public class ContaBancaria {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar R$ " + valor);
        }
        saldo -= valor;
        System.out.println("Saque realizado: R$ " + valor);
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
