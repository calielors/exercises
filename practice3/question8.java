package practice3;
import java.util.Scanner;

public class question8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        String pesquisa = input.nextLine();
        input.close();
        int cont = 0;
        int posicao = frase.indexOf(pesquisa);
            while (posicao != -1) {
            posicao = frase.indexOf(pesquisa, posicao + 1);
            cont++;
            }
        System.out.println(pesquisa + "=" + cont);
    }
}

