package aula;

import java.util.Scanner;

public class aula18p {
    public static void main(String[] args) {
        
    String time;
    aula18 torcida = new aula18();
    Scanner texto = new Scanner(System.in);

    System.out.println("Para qual time você torce?");
    time = texto.nextLine();

    torcida.setTime(time);
    torcida.mostraTime();
    }
}
