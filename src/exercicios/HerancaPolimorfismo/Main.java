package exercicios.HerancaPolimorfismo;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculoCarro = new Carro();
        veiculoCarro.marca = "Chevrolet";
        veiculoCarro.modelo = "Tracker";
        veiculoCarro.mover();  // Polimorfismo: Chama o metodo mover() da classe Carro

        Veiculo veiculoMoto = new Moto();
        veiculoMoto.marca = "Yamaha";
        veiculoMoto.modelo = "xj6";
        veiculoMoto.mover();  // Polimorfismo: Chama o metodo mover() da classe Moto

        // A partir daqui, você pode chamar métodos específicos de Carro ou Moto
        Carro carro = (Carro) veiculoCarro;
        carro.ligarArCondicionado();  // Metodo específico do Carro

        Moto moto = (Moto) veiculoMoto;
        moto.fazerManobra();  // Metodo específico da Moto
    }
}
