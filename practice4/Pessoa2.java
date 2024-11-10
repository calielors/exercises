package practice4;

public class Pessoa2 {

    String nome;
    double altura;
    double peso;

    public Pessoa2() {
        this.nome = "Fulano";
        this.altura = 1.80;
        this.peso = 80.0;
    }

    public Pessoa2(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void print() {
        System.out.println("Nome: " + nome + ", Altura: " + altura + ", Peso: " + peso + ", IMC: " + calcularIMC());
    }
}
