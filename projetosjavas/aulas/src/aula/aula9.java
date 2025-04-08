package aula;
//operadores ternarios= usados para decidir avaliar expressões booleanas e decidir qual valor será atribuido a uma variável.
public class aula9 {

    public static void main(String[] args) {
         int a;
        String b;
        //variavel (x) = (expressão)? valor se verdadeiro:valor se falso
        /*a=12;
        b= (a==5)? "a é igual a 5": "a é diferente de 5";
        System.out.println("Resultado" + b);

        b= (a==12)? "a é igual a 12": "a é diferente de 12";
        System.out.println("Resultado" + b);*/

        a=14;
        b = (a>14) ? "atrasado" : (a<14)? "adiantado":"no horario";
        System.out.println("resultado e " + b);
    }
}