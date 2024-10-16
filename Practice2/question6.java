package Practice2;
import java.util.Scanner;
public class question6{
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        byte numero;
        byte soma = 0;
        byte quantidade = 0;

        do {
            numero = inputNum.nextByte();

            if (numero >= 0) {
                soma += numero;
            }
            quantidade++;
        } while (numero >= 0);

        System.out.println("Quantidade = " + quantidade);
        System.out.println("Soma = " + soma);
        inputNum.close();
    }
}