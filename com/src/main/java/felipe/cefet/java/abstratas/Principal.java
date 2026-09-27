package felipe.cefet.java.abstratas;

public class Principal {
    
    public static void main(String[] args){

        Veiculo v1 = new Veiculo();
        Carro c1 = new Carro();
        Aviao a1 = new Aviao();
        Onibus o1 = new Onibus();


        v1.ligar();
        c1.ligar();
        a1.ligar();
        o1.ligar();



    }

}
