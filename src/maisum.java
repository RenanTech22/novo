import java.util.Scanner;

public class maisum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, c1, d, d1, e, e1, f, f1, g;

        System.out.println("Fala um número pae");
        a = sc.nextInt();

        System.out.println("Fala outro número pae");
        b = sc.nextInt();

        c = a/100;
        d = ((a%100)/10)*10;
        e = (a%10)*100;
        f = c+d+e;

        c1 = b/100;
        d1 = ((b%100)/10)*10;
        e1 = (b%10)*100;
        f1 = c1+d1+e1;

        g = f+f1;

        System.out.println("Os dois ao contrário: A; "+f+" e o B; "+f1);
        System.out.println("A soma deles ao contrário: "+g);







    }
}
