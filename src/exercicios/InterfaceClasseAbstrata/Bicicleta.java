package exercicios.InterfaceClasseAbstrata;

public class Bicicleta extends Veiculo implements ITransporte{

    Bicicleta(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    void mover() {
        System.out.println("A bicicleta está se movendo.");
    }

    @Override
    public void iniciar() {
        System.out.println("A bicicleta está iniciando.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta está parando.");
    }
}
