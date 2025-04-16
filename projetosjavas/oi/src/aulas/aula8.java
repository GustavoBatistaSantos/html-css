package aulas;

public class aula8 {
    //aula de incrmento e decremento
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        System.out.println("valor original" + result);
        result = num++;//Primeiro atribui, depois incrementa
        System.out.println("valor de num após incremento: " + num);
        System.out.println("Valor result após o incremento" + result);

        num = 10; result = 0;

        result = ++num; //primeiro incrementa, depois atribui
        System.out.println("Valor de num após incremento" + num);
        System.out.println("Valor result após o incremento" + result);
    }
}
