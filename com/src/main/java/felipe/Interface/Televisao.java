package felipe.Interface;

public interface Televisao {

    //um atributo tem que ser public e ele semrpe vai ser estatico, mesmo que a gente nao coloque

    public static  final int canal = 0;

    public void ligar();
    public void desligar();
    public void alterarVolume();
    public void alterarCanal();



}
