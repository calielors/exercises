package practice4;

public class Pessoa3 {

    String nome;
    double altura;
    double peso;

    public Pessoa3() {
        this.nome = "Fulano";
        this.altura = 1.80;
        this.peso = 80.0;
    }

    public Pessoa3(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    public void print() {
        System.out.println("Nome: " + nome + ", Altura: " + altura + ", Peso: " + peso + ", IMC: " + calcularIMC() + ", Classificação: " + classificacaoIMC());
    }
}

