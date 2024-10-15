package Practice1;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroInteiro = scanner.nextInt();

        float numeroFlutuante = scanner.nextFloat();

        String palavra = scanner.next();

        scanner.close();

        System.out.println(numeroInteiro);
        System.out.println(numeroFlutuante);
        System.out.println(palavra);
    }
}
