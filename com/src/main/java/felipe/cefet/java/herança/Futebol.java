package felipe.cefet.java.herança;

public class Futebol extends Pessoa {

    private int tamanhoChuteira = 40;

    public void chutar() {
        System.out.println("[ATACANTE]: Chutando");
    }

    public int getTamanhoChuteira() {
        return tamanhoChuteira;
    }

    public void setTamanhoChuteira(int tamanhoChuteira) {
        this.tamanhoChuteira = tamanhoChuteira;
    }

    @Override
    public void correr() {
        System.out.println("[ATACANTE]: Correndo");
    }

}
