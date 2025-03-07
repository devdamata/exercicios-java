package InterfaceEclasseAbstrata;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mingau", 2);

        cachorro.fazerBarulho();
        cachorro.dormir();
        cachorro.emitirSom();
        cachorro.comer();

        System.out.println();

        gato.fazerBarulho();
        gato.dormir();
        gato.emitirSom();
        gato.comer();
    }
}
