import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p1, p2, t1, t2, t3, mf;

        System.out.println("Quanto você tirou na primeira prova? ");
        p1 = sc.nextDouble();

        System.out.println("Quanto você tirou na segunda prova? ");
        p2 = sc.nextDouble();

        System.out.println("Quanto você tirou no primeiro trabalho? ");
        t1 = sc.nextDouble();

        System.out.println("Quanto você tirou no segundo trabalho? ");
        t2 = sc.nextDouble();

        System.out.println("Quanto você tirou no terceiro trabalho? ");
        t3 = sc.nextDouble();

        mf = (((p1+p2)/2)*7+((t1+t2+t3)/3)*3)/10;

        if (mf>=6) {
            System.out.printf("Você tirou %.2f então foi aprovado",mf);
        }
        else {
            System.out.printf("Você tirou %.2f então foi reprovado, seu fudido.",mf );
        }

    }
}



git commit -m "ja pingou ai"
git push