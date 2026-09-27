package felipe.cefet.java;

public class Triangulo {

    private int lado1=0;
    private int lado2=0;
    private int lado3=0;


    //construtor
    public Triangulo(){

    }

    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public int calcularPerimetro(){
        return this.lado2+this.lado2+this.lado3;
    }

    public int calcularPerimetro(int lado1, int lado2, int lado3){
        return lado1+lado2+lado3;
    }

    public int calcularPerimetro(int lado1){
        return lado1*3;
    }

}
