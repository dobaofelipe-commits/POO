package felipe.Interface;

public class SmarTv implements Televisao, Smart{

    @Override
    public void alterarVolume() {
        System.out.println("[SMARTV]: Alterando Volume");
    }

    @Override
    public void alterarCanal() {
        // TODO Auto-generated method stub
        System.out.println("[SMARTTV]: Alterando canal");
        
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("[SMARTTV]: Desligando");
        
        
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("[SMARTTV]: Ligando");
        
    }

    @Override 
    public void baixarApp(){
        System.out.println("[SMARTTV]: Baixando App");
    }

    @Override 
    public void acessarInternet(){
        System.out.println("[SMARTTV]: Acessando internet");
    }
    


}
