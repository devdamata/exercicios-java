package exercicios.InterfaceClasseAbstrata;

abstract class Veiculo {

    String marca;
    String modelo;

    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    abstract void mover();
}
