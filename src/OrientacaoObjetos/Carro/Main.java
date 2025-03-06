package OrientacaoObjetos.Carro;

public class Main {

    public static void main(String[] args) {
        //Com construtor
        Carro meuCarro = new Carro("Fusca", 1969);

//        Sem construtor
//        Carro meuCarro = new Carro();
//        meuCarro.modelo = "Fusca";
//        meuCarro.ano = 1969;

        meuCarro.exibirInfo();
    }
}
