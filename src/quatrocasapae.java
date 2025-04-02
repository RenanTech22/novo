import java.util.Scanner;

public class quatrocasapae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e, f, g, h;

        System.out.println("FAla um número pae: ");
        a = sc.nextInt();

        b = a%10*1000;
        c = ((a%100)/10)*100;
        d = ((a%1000)/100)*10;
        e = (a/1000);
        f = b+c+d+e;

        System.out.println("O número ao contrário fica: "+f);
    }
}
