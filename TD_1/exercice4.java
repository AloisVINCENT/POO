package TD_1;
import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        
        System.out.println("Entrez un nombre multiple de 5 :");
        
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            while (x != 0) {
                if (x >= 50) {
                    a++;
                    x = x -50;
                } else if (x >= 20) {
                    b++;
                    x = x - 20;
                } else if (x >= 10) {
                    c++;
                    x = x - 10;
                } else if (x >= 5) {
                    d++;
                    x = x -5;
                } else {
                    x = 0;
                }
            }
            if (a != 0 | b != 0 | c != 0 | d != 0) {
                if (a != 0) {
                    System.out.println(a + " X 50");
                }
                if (b != 0) {
                    System.out.println(b + " X 20");
                }
                if (c != 0) {
                    System.out.println(c + " X 10");
                }
                if (d != 0) {
                    System.out.println(d + " X 5");
                }
            } else {
                System.out.println("Pas de billets à rendre");
            }
        }
    }
}
