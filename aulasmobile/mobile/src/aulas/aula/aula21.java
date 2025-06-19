package aula;

public class aula21 {
    
    public static void main(String[] args) {
        char[] arrayCarac = {'B', 'o', 's', 'o', 'n', ' ','T','r','e','i','n','a','m','e','n','t','o','s'};
        String txt = new String ("Fábio dos reis");
        String txt4 = "Fabio dos Reis";

        //Três formas de Construtores da classe String
        String tex1= new String();
        // criação de string vazia
        String tex2 = new String(txt);
        // passar o valor de outra string para a nova string
        String tex3 = new String(arrayCarac);
        //passar o array de caracteres para a string
        System.out.println("text 1 " + tex1 + "text 2 =" + tex2 + " text 3 = " + tex3);

        System.out.println("O comprimento da string txt é " + txt.length());
        //conta o número de caracteres de uma string

        //metodo get char permite criar um array de caracteres apartir de uma string
        char[] arrayCar = new char [5];//5posições

        txt4.getChars(0,5, arrayCar, 0);//posição inicial, posição final, nome do array, posição da onde vai começar, 5 não le o ultimo
        System.out.println("O arrays de caracteres criado é ");
        for (char caractere : arrayCar){
            System.out.println(caractere);

        }

        //metodo para pegar um carctere individual
        System.out.println("O caractere de indice 0 em tex3 é " + tex3.charAt(0));

        //mostrar todos os caracteres em reverso
        System.out.println("String tex3 de tras para frente ");
        for (int cont = tex3.length() -1; cont>=0; cont--){
            System.out.println(" "+tex3.charAt(cont));
            // começa com um contador que recebe -1 pq vai ate a posição 9, ate chegar em um valor maior ou igual a zero, o cont -- é para ir diminuindo
        }
    }
}
