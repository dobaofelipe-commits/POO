package felipe.cefet.java.abstratas;

public class Onibus extends  Veiculo {

    @Override 
    public void ligar(){
        System.out.println("[ONIBUS]: Ligado");
    }
    @Override 
    public void desligar(){
        System.out.println("[ONIBUS]: Desligado");
    }
    @Override 
    public void locomovendo(){
        System.out.println("[onibus]: Locomovendo");
    }
    
}
