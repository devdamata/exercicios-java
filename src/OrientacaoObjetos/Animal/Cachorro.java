package OrientacaoObjetos.Animal;

public class Cachorro extends Animal{

    void latir() {
        System.out.println(nome + " está latindo.");
    }

    //exemplo de polimorfismo
    @Override
    void fazerSom() {
        System.out.println(nome + " está uivando.");
    }
}
