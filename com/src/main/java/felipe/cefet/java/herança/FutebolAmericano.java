package felipe.cefet.java.herança;

public class FutebolAmericano extends Pessoa {

    private String corCapacete = "Vermelho";

    public void arremesar() {
        System.out.println("[Q8]: Arremesando");
    }

    public String getCorCapacete() {
        return corCapacete;
    }

    public void setCorCapacete(String corCapacete) {
        this.corCapacete = corCapacete;
    }

    @Override
    public void correr() {
        System.out.println("[QB]: Correndo");
    }

}
