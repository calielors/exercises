package practice3;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int vetor[] = new int[N];
        if (N > 1){
            for (int i = 0; i < vetor.length; i++){
                vetor[i] = input.nextInt(); 
            } 
        }
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        input.close();
        double media = 0;
        System.out.printf("%.2f\n", media = (soma / N));
        for(int response : vetor){
            if (response > media){
                System.out.println(response);
            }     
         }
    }
}
