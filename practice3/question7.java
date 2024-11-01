package practice3;
import java.util.Scanner;

public class question7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        String fraseInversa = new StringBuilder(frase).reverse().toString();
        System.out.println(fraseInversa);
        System.out.println(frase.length()); 
        input.close();  
    }           
}  

