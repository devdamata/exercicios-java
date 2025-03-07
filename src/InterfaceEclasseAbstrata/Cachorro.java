package InterfaceEclasseAbstrata;

public class Cachorro extends Animal implements IAnimal{

    Cachorro(String nome, int idade){
        super(nome, idade);
    }

    // Implementação do metodo abstrato da classe Animal
    @Override
    void fazerBarulho() {
        System.out.println(nome + " está latindo.");
    }

    // Implementação dos metodos da interface IAnimal
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz au-au.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
