package exercicios;

public class ExercicioArrayMetodo {

    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Número: " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        imprimirArray(numeros);
    }
}
