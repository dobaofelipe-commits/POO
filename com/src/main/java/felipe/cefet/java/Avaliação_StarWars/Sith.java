package felipe.cefet.java.Avaliação_StarWars;

public class Sith implements Force {
     private String nome;
    private String titulo;
    private String[] weapons;

    public Sith(){

    }

    public Sith(String nome){
        this.nome=nome;
    }

    public Sith(String nome, String titulo){
        this.nome=nome;
        this.titulo=titulo;
    }

    public Sith(String nome, String titulo, String[] weapons){
        this.nome=nome;
        this.titulo=titulo;
        this.weapons=weapons;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }


    public String getTitulo(){
        return this.titulo;
    }

    public void setWeapons(String[] weapons){
        this.weapons = weapons;
    }

    public String[] setWeapons(){
        return this.weapons;
    }

     public void mindControl(){
        System.out.println("[SITH]: Mind Control");
    }

    public void farseeing(){
        System.out.println("[SITH]: farseeing");
    }
    public void telepath(){
        System.out.println("[SITH]: telepath");
    }
    public void levitation(){
        System.out.println("[SITH]: Levianting Something");
    }

}
