package aula;

public class aula15p {
    
    public static void main(String[] args) {
        //objeto
        aula15 livro = new aula15();

        livro.nome = "O Senhor dos Anéis";
        livro.descrição = "Uma obra-prima da literatura de fantasia.";
        livro.isbn = "9783161484100";
        livro.preco = 39.90;
        livro.autor = "J.R.R. Tolkien";
        livro.dataPub = "1954";

        //fazer um system out de exemplo
        //chama o método
        livro.dadosLivro();


    }
}
