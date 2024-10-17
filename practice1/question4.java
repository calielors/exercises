package practice1;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("soma = " + (num1 + num2));
        System.out.println("subtracao = " + (num1 - num2));
        scanner.close();
    }
}