package aula;
//AULA DE CLASSE
public class aula15 {
    String nome;
    String descrição;
    String autor;
    String isbn;
    double preco;
    String dataPub;
    //CLASSE NOME DO OBJETO = new NOME DA CLASSE

    void dadosLivro() {
        System.out.println("Nome do livro: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Publicação: " + dataPub);
        //método
        //void = não retorna nada mas executa uma tarefa 
        //dadosLivro = nome do método
    }
}
