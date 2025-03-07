package InterfaceEclasseAbstrata;

public class Gato extends Animal implements IAnimal{

    Gato(String nome, int idade){
        super(nome, idade);
    }

    // Implementação do metodo abstrato da classe Animal
    @Override
    void fazerBarulho() {
        System.out.println(nome + " está miando.");
    }

    // Implementação dos metodos da interface IAnimal
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz miau.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
