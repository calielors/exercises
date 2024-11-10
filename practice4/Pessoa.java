package practice4;

public class Pessoa {

    String nome;
    double altura;
    double peso;

    public Pessoa() {
        this.nome = "Fulano";
        this.altura = 1.80;
        this.peso = 80.0;
    }

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void print() {
        System.out.println("Nome: " + nome + ", Altura: " + altura + ", Peso: " + peso);
    }
}
