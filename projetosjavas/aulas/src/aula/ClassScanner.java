package aula;

import java.util.Scanner;

public class ClassScanner {
    
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in); //entrada padrão de dados e texto objeto para pegar dados do teclado
        String str;
        System.out.println("Entre com seu nome:");
        str = texto.nextLine();//metodo para pegar o texto e armazenar em str
        System.out.println("Bem-vindo "+ str);

        System.out.println("Entre com um numero inteiro:");
        int numero = texto.nextInt(); //metodo para pegar um numero inteiro
        System.out.println("O numero digitado foi: "+ numero);
        texto.close(); // fecha a entrada de dados para não dispersar memoria
    }
}
