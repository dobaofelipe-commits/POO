package felipe.cefet.java.abstratas;

public class Carro extends Veiculo {

    @Override 
    public void ligar(){
        System.out.println("[CARRO]: Ligado");
    }

    @Override 
    public void desligar(){
        System.out.println("[CARRO]: Desligado");
    }

    @Override 
    public void locomovendo(){
        System.out.println("[CARRO]: Locomovendo");
    }
}
