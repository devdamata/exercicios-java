package exercicios.OOLivros;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);

        livro1.exibirInfo();
        System.out.println();
        livro2.exibirInfo();
    }
}
