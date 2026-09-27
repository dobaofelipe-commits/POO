package felipe.cefet.java.Avaliação_StarWars;

public class Jedi implements Force {
    private String nome;
    private String titulo;
    private String[] weapons;

    public Jedi(){

    }

    public Jedi(String nome){
        this.nome=nome;
    }

    public Jedi(String nome, String titulo){
        this.nome=nome;
        this.titulo=titulo;
    }

    public Jedi(String nome, String titulo, String[] weapons){
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

    public String[] getWeapons(){
        return this.weapons;
    }

    

    public void mindControl(){
        System.out.println("[JEDI]: Do what I wish");
    }

    public void farseeing(){
        System.out.println("[JEDI]: farseeing");
    }
    public void telepath(){
        System.out.println("[JEDI]: telepath");
    }
    public void levitation(){
        System.out.println("[JEDI]: Levitation");
    }

}
