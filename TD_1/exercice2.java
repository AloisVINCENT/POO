package TD_1;
import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("La valeur de A est :" + a);
            System.out.println("La valeur de B est :" + b);
            System.out.println("La valeur de C est :" + c);

            int temp = a;
            a = b;
            b = c;
            c = temp;

            System.out.println("La nouvelle valeur de A est :" + a);
            System.out.println("La nouvelle valeur de B est :" + b);
            System.out.println("La nouvelle valeur de C est :" + c);
        }
    }
}
