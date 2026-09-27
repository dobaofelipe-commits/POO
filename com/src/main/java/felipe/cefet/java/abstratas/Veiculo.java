package felipe.cefet.java.abstratas;

public class Veiculo {
    
    private String cor ="Verde";
    private int qntPessoas = 5;

    public void ligar(){
        System.out.println("[VEICULO]: ligado");
    }

    public void desligar(){
        System.out.println("[VEICULO]: desligado");
    }

    public void locomovendo(){
        System.out.println("[VEICULO]: locomovendo");

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }



    
}
