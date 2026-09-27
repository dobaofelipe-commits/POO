package felipe.Interface;

public class OldTv implements Televisao {

     @Override
    public void alterarVolume() {
        System.out.println("[OLDTV]: Alterando Volume");
    }

    @Override
    public void alterarCanal() {
        // TODO Auto-generated method stub
        System.out.println("[OLDTV]: Alterando canal");
        
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("[OLDTV]: Desligando");
        
        
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("[OLDTV]: Ligando");
        
        
    }
    
    
}
