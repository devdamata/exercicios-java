package InterfaceEclasseAbstrata;

abstract class Animal {
    String nome;
    int idade;

    Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo concreto (com implementação)
    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Metodo abstrato (sem implementação)
    abstract void fazerBarulho();
}
