package felipe.cefet.java.herança;

public class Boxe extends Pessoa {

    private String marcaLuva = "Adidas";

    public void socar() {
        System.out.println("[BOXE]: Socando");
    }

    public String getMarcaLuva() {
        return marcaLuva;
    }

    public void setMarcaLuva(String marcaLuva) {
        this.marcaLuva = marcaLuva;
    }

    @Override
    public void correr() {
        System.out.println("[BOXE]: Correndo");
    }

}
