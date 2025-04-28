package aula;
import java.util.Scanner;
//aula de if e else
public class aula10 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      double livroLinux;
      double livroJava;

      System.out.println("Entre com o preço do livro Linux:");
      livroLinux = entrada.nextDouble();
      System.out.println("Entre com o preço do livro Java");
      livroJava = entrada.nextDouble();

      double total = livroLinux + livroJava;
      System.out.println("O preço total é " + total);

      if (livroLinux==10) {
          System.out.println("livro quase de graça!");
      }

      if (total<=120.00) {
          System.out.println("o preço está bom!");
      }

      else{
        System.out.println("Livros muitos caros !");
      }

      if (livroLinux<livroJava) {
        System.out.println("livro de linux mais barato");
      }

      else if (livroLinux>livroJava) {
        System.out.println("Livro de java mais barato");
      }
      else{
        System.out.println("Livros com o mesmo preço");
      }
  }
}
