package felipe.cefet.java;

public class Car {

    private String name = new String();
    public String type = null;
    protected final int year = 0;
    private int numberDoors = 1;
    private int numberCars = 0;

    //Construtor
    public Car( String name, String type){
        this.name=name;
        this.type= type;
    }

    public Car(String name, String type, int numberDoors, int numberCars){
        this.name = name;
        this.type = type;
        this.numberCars = numberCars;
        this.numberDoors =numberDoors;

    }


public void setName(String name){
    this.name=name;
}
public String getName(){
    return this.name;
}
public void setType(String type){
    this.type=type;
}
public String getType(){
    return this.type;
}
public void setNumberCars(int numberCars){
    this.numberCars=numberCars;
}
public int getNumberCars(){
    return this.numberCars;
}









    public void openRearDoor(){
        System.out.println("Porta aberta");
    }

    public void starsEngine(){
        System.out.println("Carro foi ligado");
    }

    public void stopEngine(){

    }



}
