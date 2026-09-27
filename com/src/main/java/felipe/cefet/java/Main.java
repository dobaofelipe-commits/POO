package felipe.cefet.java;
import felipe.cefet.java.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number;
        int numberTwo=10;
        number = 4;
        System.out.println(numberTwo);
        System.out.println(number);

        double numberThree;
        double numberfour =2.8;
        numberThree = 2.4;

        float numberFive;
        float numberSix= 2.8f;
        //Tem que usar o f no final pra identificar que é um float e nao um number
        numberFive= 2.4f;

        char letter;
        char letterTwo = 'k';
        letter = 'c';

        boolean isGreen;
        isGreen = true;
        boolean isRed = false;


        System.out.println("Running!!!");

        Car c = new Car("HB20","Chevrolet");
        c.openRearDoor();
        c.starsEngine();


    String name = new String();
    String type = null;
    int year =0;
    int numberDoors= 1;
    name = "Carlos";
    String middleName = "Eduardo";
    String nickName = null;
    String userName="";

    // Car ferrari = new Car();
    // Car ford = new Car();
    // ferrari = ford;
    // ford.type= "Sedan";

    //atributo é nativo de determinada classe, não da pra criar um atributo no meio de um metodo

    //Project myFirsProject = new Project();
    // myFirsProject.saveProject();
    // myFirsProject.addResource();
    // System.out.println(myFirsProject.addResource());

    Project myMethod = new Project();

 /* 
    myMethod.addResource(200);
    System.out.println(myMethod.valueEmplyed);
    myMethod.addResource(300);
    System.out.println(myMethod.valueEmplyed);
    myMethod.addResource(188);
    System.out.println(myMethod.valueEmplyed);
    */

    Person pessoa = new Person();
    pessoa.name= "Felipe";
    // myMethod.saveProject(pessoa, 8);
    // System.out.println(myMethod.responsible.name);
    // System.out.println(myMethod.idProject);

    System.out.println(myMethod.getIdProject());
    System.out.println(myMethod.getName());
    System.out.println(myMethod.isActive());

    Project mySecondProject = new Project();
    mySecondProject.setName("Carol");
    mySecondProject.setIdProject(4);

    System.out.println(mySecondProject.getIdProject());
    System.out.println(mySecondProject.getName());
    System.out.println(mySecondProject.verifyResources());
        

    Car c1 = new Car("Ranger","Ford" );
    System.out.println(c1.getName());

    Car c2 = new Car("felipe", 
    "Honda",
    4, 
    1);


    //Sobrecarga de Métodos

    Triangulo t1 = new Triangulo();
    Triangulo t2= new Triangulo(2, 3, 9);

    System.out.println(t2.calcularPerimetro());

    System.out.println(t1.calcularPerimetro(2,3,5));

    System.out.println(t1.calcularPerimetro(3));

        Cliente cl1= new Cliente();

        cl1.setName("Felipe");


        Cliente cl2 = new Cliente("Felipe");
        
        Cliente cl3= new Cliente("Carol", "Souza");




    }
}