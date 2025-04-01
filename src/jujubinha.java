import java.util.Scanner;

public class jujubinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e, f;

        System.out.println("Fala um número aí pae ");
        a = sc.nextInt();

        b = (a%10); /*7*/
        c = a/100; /*4*/
        d = (a%100)-b; /*50*/
        e = b*100;  /*700*/
        f = e+d+c;

        System.out.println("Esse número ao contrário fica "+f);




    }
}
