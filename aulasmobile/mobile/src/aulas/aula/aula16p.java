package aula;

public class aula16p {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;

        System.out.println("O quadrado de " + a + " é: " +  aula16.elevar(a));
        System.out.println(a + " elevado a " + b + " é: " +  aula16.elevar(a, b));
        aula16.elevar(); //chama o método sem parâmetros
    }
}
