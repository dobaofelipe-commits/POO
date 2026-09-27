package felipe.cefet.java.herança;

public class Principal {

    public static void main(String[] args){


        Pessoa p1 = new Pessoa();
        Boxe b1 = new Boxe();
        FutebolAmericano qb1 = new FutebolAmericano();
        Futebol f1 = new Futebol();

        p1.correr();
        b1.socar();
        b1.correr();

        qb1.arremesar();
        qb1.sorrir();

        f1.correr();
        f1.chutar();
        f1.sorrir();


    }
    
}
