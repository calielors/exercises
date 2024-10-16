package Practice1;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pNome = scanner.next();
        String sNome = scanner.next();
        System.out.printf("%s %s", pNome, sNome);
        scanner.close();
    }  
}
