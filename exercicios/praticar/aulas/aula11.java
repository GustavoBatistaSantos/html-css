package aulas;
import  java.util.Scanner;
public class aula11{

    //while = enquanto
    public static void main(String[] args) {      
        //int contador = 1;

        //while (contador <=50) {
           // System.out.println(contador);
            //contador ++ ;//gera condição falsa
            //incremento
       // }

       Scanner entrada = new Scanner(System.in);
       String nome;
       System.out.println("Digite o seu nome ou s para sair: ");
       nome = entrada.nextLine();
       while (!nome.equals(("s"))){
        // não se compara as strings diretamente
        // equals e o metodo de comparação e dentro do parentes e o valor que quer comparar
        //!negação
        System.out.println("Bem-vindo" + nome + "\n");
        //para ele entender que o nome não é variavel
        
        System.out.println("Digite seu nome ou s para sair:");
        nome = entrada.nextLine();
       }
       System.out.println("Fim da execução");
    }
}
