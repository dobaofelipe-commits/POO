package felipe.cefet.java.Avaliação_StarWars;

/* Essa Pasta contem a realizaÇão da avaliação de POO de Star Wars do professor Pantoja
    This folder contains the completed Star Wars OOP assessment for Teacher Pantoja's course.
    https://turing.pro.br/kadupantoja/wp-content/uploads/2023/11/Avaliacao-Java-2023110.pdf -> evaluation link
*/ 


public class Principal {
    
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Leia");
        pessoa1.setSobrenome("Organa");
        pessoa1.setSexo("Feminino");
        
        pessoa1.getNome();
        pessoa1.getSobrenome();
        pessoa1.getSexo();

        Pessoa pessoa2 = new Pessoa("Luke", "Skywalker", "Masculino" );

        Jedi jedi1 = new Jedi("Obi-Wan Kenobi" );

        Sith sith1 = new Sith("Darth Vader");

        sith1.levitation();

        jedi1.mindControl();


    }

}
