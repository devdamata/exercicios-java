public class ExcecaoSimples {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso vai causar uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            System.out.println("Bloco 'finally' sempre é executado.");
        }
    }
}
