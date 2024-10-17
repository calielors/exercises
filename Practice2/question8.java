package practice2;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int number;

        do {
            number = inputNum.nextInt();
            if (number >= 0 && number <= 25) {
                a++;
            } else if (number >= 26 && number <= 50) {
                b++;
            } else if (number >= 51 && number <= 75) {
                c++;
            } else if (number >= 76 && number <= 100) {
                d++;
            }

        } while (number >= 0);

        System.out.println("[0,25] = " + a);
        System.out.println("[26,50] = " + b);
        System.out.println("[51,75] = " + c);
        System.out.println("[76,100] = " + d);

        inputNum.close();
    }
}
