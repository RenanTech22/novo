import java.util.Scanner;

public class saipapai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Quanto você pesa? ");
        a = sc.nextDouble();

        System.out.println("Qual a sua altura? ");
        b = sc.nextDouble();

        c = a/Math.pow(b,2);

        System.out.printf("O seu IMC é de: %.2f\n ",c);
    }
}
