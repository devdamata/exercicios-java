package exercicios.InterfaceClasseAbstrata;

public class Main {

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite");
        Carro carro = new Carro("Chevrolet", "Cruze");

        bicicleta.exibirInfo();
        bicicleta.iniciar();
        bicicleta.mover();
        bicicleta.parar();

        System.out.println();

        carro.exibirInfo();
        carro.iniciar();
        carro.mover();
        carro.parar();
    }
}
