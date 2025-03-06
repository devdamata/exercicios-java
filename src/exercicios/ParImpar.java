package exercicios;

public class ParImpar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
           if (i % 2 == 0 ){
                System.out.println("Número par: " + i);
              } else {
                System.out.println("Número ímpar: " + i);
           }
        }
    }
}
