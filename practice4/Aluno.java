package practice4;

public class Aluno {

    String nome;
    int idade;
    char genero;
    long ra;

    public Aluno() {
        this.nome = "Aluno";
        this.idade = 18;
        this.genero = 'M';
        this.ra = 123456789;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.genero = 'M';
        this.ra = 123456789;
    }
    
    public Aluno(String nome, char genero, long ra) {
        this.nome = nome;
        this.genero = genero;
        this.ra = ra;
        this.idade = 18;
    }

    public void print() {
        System.out.println(nome + " - " + idade + " - " + genero + " - " + ra);
    }
}