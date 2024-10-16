package Practice2;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        byte opcao = inputNum.nextByte();
        
        switch (opcao) {
            case 1:
                System.out.println("1 - Caixa");
                break;
            case 2:
                System.out.println("2 - Financiamento");
                break;
            case 3:
                System.out.println("3 - Empréstimo");
                break;
            case 4:
                System.out.println("4 - Produtor Rural");
                break;
            case 5:
                System.out.println("5 - Abertura de Contas");
                break;
            case 6:
                System.out.println("6 - Falar com o Gerente");
                break;
            case 7:
                System.out.println("7 - Opção Inexistente");
                break;
            default:
                System.out.println("0 - Opção Inexistente");
                break;
        }
       inputNum.close();
    }
}

