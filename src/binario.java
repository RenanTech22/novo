import java.util.Scanner;
public class binario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, a1, b, b1, c, c1, d, d1, e, e1;

        System.out.println("Fala um número em binário até 4 algarismos aí: ");
        a = sc.nextInt();

        b = a%10; /*1*/
        c = a%100/10; /*0*/
        d = a%1000/100; /*1*/
        e = a/1000; /*1*/

        b1 = b*1;
        c1 = c*2;
        d1 = d*4;
        e1 = e*8;

        a1 = b1+c1+d1+e1;

        System.out.println("seu número normal é esse aí: "+a1);




    }
}
