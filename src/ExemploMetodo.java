public class ExemploMetodo {

    public static void saudacao(){
        System.out.println("Olá, bem vindo ao mundo Java!");
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        saudacao();
        System.out.println("Soma: " + somar(10, 5));
    }
}
