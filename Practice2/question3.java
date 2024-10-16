package Practice2;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();    }
    
        int maior = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println(maior);
        scanner.close();
    }
}
