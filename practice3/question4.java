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
        media = (soma / N);
         System.out.printf("%.2f\n", media);
         int mMedia[] = new int[N];
         int i;
         int j = 0;
        for(i = 0; i < vetor.length; i++){
            if (vetor[i] > media){
                mMedia[j] = vetor[i];
                System.out.println(mMedia[j]);
                j++;
            }
        }
    }
}
