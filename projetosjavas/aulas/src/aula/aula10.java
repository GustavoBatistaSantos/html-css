
package aula;

public class aula10 {
    //operadores condicioanl if else
    /*public static void main(String[] args) {
        if (false) {
            System.out.println("verdadeiro");
        }else{
            System.out.println("falso");
        }
        
    }*/

    /*public static void main(String[] args) {
        String sexo = "";
        if(sexo == "Masculino") {
            System.out.println("sexo masculino");
        } else if (sexo == "Feminino") {
            System.out.println("sexo feminino");
        }
        else{
            System.out.println("Selecione o seu sexo");
        }
    }*/

    public static void main(String[] args) {
        
        int idade = 18;

        if(idade <=10){
            System.out.println("Criança");
        }else if(idade <=17 ){
            System.out.println("adolescente");
        } else{
            System.out.println("Adulto");
        }

    }
}
