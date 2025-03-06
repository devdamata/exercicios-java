package OrientacaoObjetos.Animal;

public class Gato extends Animal{

    void miar() {
        System.out.println(nome + " está miando.");
    }

    //exemplo de polimorfismo
    @Override
    void fazerSom() {
        System.out.println(nome + " está ronronando.");
    }
}
