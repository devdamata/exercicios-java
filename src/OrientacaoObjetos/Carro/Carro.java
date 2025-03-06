package OrientacaoObjetos.Carro;

public class Carro {
    String modelo;
    int ano;

    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
