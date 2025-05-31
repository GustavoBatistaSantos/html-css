package aula;
//passagem de parametros dentro de um método
import java.util.Scanner;

public class aula17p {
    
    public static void main(String[] args) {
        String nomeAluno;
        int idadeAluno;
        Scanner entrada = new Scanner(System.in);
        aula17 oi = new aula17();

        System.out.println("Entre com seu nome:");
        nomeAluno = entrada.nextLine();

        System.out.println("Entre com a sua idade");
        idadeAluno = entrada.nextInt();

        oi.mandaBoasVindas(nomeAluno, idadeAluno);
        oi.enviarMensagem();
        
        entrada.close();

        
    }
}
