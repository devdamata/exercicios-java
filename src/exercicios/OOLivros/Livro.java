package exercicios.OOLivros;

public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;

    Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo(){
        System.out.println("Informações do Livro:");
        System.out.println("----------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}
