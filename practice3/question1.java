package practice3;

public class question1 {
    public static void main(String[] args) {
        double n = maior(5, 6, 3, 10);
        System.out.printf("%.1f", n);
    }
    public static double maior(double a, double b, double c, double d) {
        double maior = a;
        if (maior < b) {
            maior = b;
        }
        if (maior < c) {
            maior = c;

        }
        if (maior < d) {
            maior = d;
        }
        return maior;
    }
}
