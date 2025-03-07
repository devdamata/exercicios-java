package exercicios.InterfaceClasseAbstrata;

public class Carro extends Veiculo implements ITransporte{

    Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void iniciar() {
        System.out.println("O carro está iniciando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando.");
    }
}
