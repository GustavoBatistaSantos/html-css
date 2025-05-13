package aula;

public class aula16 {
    //metodo que não calcula nada, apenas imprime na tela
    public static void elevar() {
        System.out.println("este médoto não calcula nada");
    }
    //Método que calcula o quadrado de i
    //elevar é um metodo com mesmo nome, mas com assinatura diferente(parametros diferentes)
    public static double elevar(double  i) {
        return i * i;
    }

    //Método que calcula i elevado a j
    //math.pow(i, j) é um método do java  que calcula i elevado a j
    public static double elevar(double i, double j) {
       return Math.pow(i, j);
    }
}
