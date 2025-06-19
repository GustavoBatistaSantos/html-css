package aula;
//aula de stingbuilder criação de string que podem ser modificadas
public class aula22 {
    public static void main(String[] args) {
        StringBuilder string3 = new StringBuilder("boson treinamentos");//passando direto a string capacidade inicial que é o numero de caracteres digitado mais o número padrão que é 16
        System.out.println("string1 = " + string3.toString());//passar para string que não precisaria pq já e um texto
        System.out.println("capacidade = " + string3.capacity());
        System.out.println("comprimento =  " + string3.length());
        string3.setLength(15);//comprimento15
        System.out.println("novo comprimento" + string3.length());
        System.out.println("string1 = " + string3.toString());
    }
}
