package OrientacaoObjetos.Animal;

public class Main {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Lua";
        dog.idade = 3;
        dog.comer();
        dog.latir();
        dog.dormir();
        dog.fazerSom();  //Polimorfismo: Chama o metodo da classe Cachorro

        Gato cat = new Gato();
        cat.nome = "Felicia";
        cat.idade = 2;
        cat.comer();
        cat.miar();
        cat.dormir();
        cat.fazerSom();  //Polimorfismo: Chama o metodo da classe Gato
    }
}
