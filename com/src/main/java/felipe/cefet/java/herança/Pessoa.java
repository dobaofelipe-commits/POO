package felipe.cefet.java.herança;

public class Pessoa {
    private String nome;
    private String sobrenome;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }


    public void andar(){
        System.out.println("[PESSOA]: Andando.");
    }

    public void falar(){
        System.out.println("[PESSOA]: Correndo");
    }

    public void sorrir(){
        System.out.println("[PESSOA]: Sorrindo");
    }

    public void correr(){
        System.out.println("[PESSOA]: Correndo");
    }

}


