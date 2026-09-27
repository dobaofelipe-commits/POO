package felipe.cefet.java;

public class Cliente {
    

    private String name;
    private String sobrenome;
    private String nascimento;
    private String sexo;

    public Cliente(){

    }

    public Cliente(String name){
        this.name=name;
    }

    public Cliente(String name, String sobrenome){
        this.name=name;
        this.sobrenome=sobrenome;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setSobremome(String sobrenome){
        this.sobrenome=sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setNascimento(String nascimento){
        this.nascimento=nascimento;
    }

    public String getNascimento(){
        return this.nascimento;
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public String getSexo(){
        return this.sexo;
    }

}
