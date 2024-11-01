package practice3;
import java.util.Scanner;

public class question6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        int[] vogais = new int[5];
        do{

            frase = input.nextLine();

            for (int j = 0; j < frase.length(); j++) {
                char c = frase.charAt(j);      
                if (c == 'a' || c == 'A') vogais[0]++;
                else if (c == 'e' || c == 'E') vogais[1]++;
                else if (c == 'i' || c == 'I') vogais[2]++;
                else if (c == 'o' || c == 'O') vogais[3]++;
                else if (c == 'u' || c == 'U') vogais[4]++;   
            }      
        }while(!frase.equals("FIM"));

        input.close();
        
            for (int i = 0; i < vogais.length; i++) {

                System.out.println(letras[i] + "=" + vogais[i]);
            }

    }
}
