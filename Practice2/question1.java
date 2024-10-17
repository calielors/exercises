package practice2;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double num1 = scan.nextFloat();
            double num2 = scan.nextFloat();
            double num3 = scan.nextFloat();
            double num4 = scan.nextFloat();
        System.out.println((num1 + num2 + num3 + num4)/4);
        scan.close();
    }
}