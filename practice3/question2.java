package practice3;

public class question2 {
    public static void main(String[] args) {
        int vetor[] = {1,-2,3,4,-5,6,-7};
int maior = procuraMaiorValor(vetor);
System.out.println(maior);
    }
    public static int procuraMaiorValor(int[] vetor){
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++){
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }  
}
