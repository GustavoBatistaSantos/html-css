package aula;

import java.util.Random;

public class numeroAleat {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        float valor = aleatorio.nextFloat() * 100;//entre 0 e 100
        //float valor = aleatorio.nextFloat(); entre 0 e 1
        //int valor = aleatorio.nextInt(30) +1;//intervalo 1 a 30
        //int valor = aleatorio.nextInt(30);//intervalo de 0 a 29
        System.out.println("Numero gerado " + valor);
    }
}