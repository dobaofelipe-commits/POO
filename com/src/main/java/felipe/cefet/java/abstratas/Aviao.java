package felipe.cefet.java.abstratas;

public class Aviao extends Veiculo{
    
    @Override 
    public void ligar(){
        System.out.println("[AVIAO]: Ligado");
    }
    @Override 
    public void desligar(){
        System.out.println("[AVIAO]: Desligado");
    }
    @Override 
    public void locomovendo(){
        System.out.println("[AVIAO]: Voando");
    }
}
