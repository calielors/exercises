package practice3;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
int tam = entrada.nextInt();
int matriz[][] = new int[tam][tam];
        
for (int i=0; i<tam; i++){
    for (int j=0; j<tam; j++){
        matriz[i][j] = entrada.nextInt();
    }
    entrada.close();
}
printDiagonalPrincipal(matriz);
    }
    public static int printDiagonalPrincipal(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {  
            System.out.print(matriz[i][i] + " ");
        }
        return 0;
    }
}
