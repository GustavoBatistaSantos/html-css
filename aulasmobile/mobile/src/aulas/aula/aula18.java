package aula;
//aula de getter(alterar) seters(leitura) para class privadas lendo o que estao armazenados em um atributo
public class aula18 {
    private String nomeTime;
    public void setTime(String meuTime){
        nomeTime = meuTime;
    }

    public String getTIME(){
        return nomeTime;
    }
    public void mostraTime(){
        System.out.println("Seu time do coração é " + getTIME());
    }
    
}
