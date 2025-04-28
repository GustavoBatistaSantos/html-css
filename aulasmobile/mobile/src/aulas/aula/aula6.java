package aula;

import java.util.Scanner;

public class aula6 {
    private  static final double LARGURA = 10.0;
    //final para constante

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o comprimento");
        double compr = entrada.nextDouble();

        double area = calculaArea(LARGURA, compr);
        System.out.println("A area e: " + area);

        entrada.close();
        
        //função
    }

    private  static  double calculaArea(double largura, double comprimento){
        return largura*comprimento;
        //função
    }
}
