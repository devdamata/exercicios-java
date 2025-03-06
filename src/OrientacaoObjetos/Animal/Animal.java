package OrientacaoObjetos.Animal;

public class Animal {

    String nome;
    int idade;

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    //exemplo de polimorfismo
    void fazerSom() {
        System.out.println("Som de animal");
    }
}
