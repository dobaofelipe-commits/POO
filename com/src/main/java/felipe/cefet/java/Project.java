package felipe.cefet.java;

public class Project {
    public int idProject=8;
    private String name = "Felipe";
    private String description = "";
    private boolean isActive = true;
    private double valueEmplyed = 0;
    private Person responsible;

    public int getIdProject(){
        return this.idProject;
    }

    public String getName(){
        return this.name;
    }


    //para boolean colocamos sem get poruqe é como se fosse uma pergunta
    // Ex ele é verdadeiro ou falso 
    public boolean isActive(){
        return this.isActive;
    }

    public void setIdProject(int idProject){
        if(idProject>0)
            this.idProject=idProject;
        else
            System.out.println("Invalid value");
    }

    public void setName(String name){
        this.name=name;
    }

    




    public void saveProject(Person responsible, int id) {
        this.responsible = responsible;
        this.idProject = id;
        System.out.println("Projeto Saved");
    }

    public String addResource(int value){
            this.valueEmplyed+=value;
            return "Money added";    
    }

    private boolean verifyResources(){
        if(this.isActive && this.valueEmplyed<500)
            return true;
        else
            return false;
    }
}
