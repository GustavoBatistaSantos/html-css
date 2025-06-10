package aula;
//aula de array
public class aula20 {

    public static void main(String[] args) {
        double[] valores = new double[6];

    //preencher o array
    valores [0] = 6.0;
    valores [1] = 7.5;
    valores [2] = 8.2;
    valores [3] = 2.3;
    valores [4] = 1.5;
    valores [5] = 4.9;

    //acessando o quinto elemento (número da posição 4)
    System.out.println("Elemento 5 do array" + valores[4]);

    //alterando os valores de duas posições do array
    valores[0] = 2.3;
    valores[4] = 7.1;

    //acessando os elementos alterados
    System.out.println("Posição 0 alterada para: " + valores[0]);
    System.out.println("posição 4 alterada para: " + valores[4]);

    //mostrar todos os elementos do array
        for (double elemento: valores){
            System.out.println(elemento);
        }
    //somar elementos do array 
    double total = 0;
    for (int i =0; i <valores.length; i++) {
        //length é o tamanho do array 
        total +=valores[i];
    }
    System.out.println("O total é " + total);
    }
}
