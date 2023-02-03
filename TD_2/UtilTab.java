package TD_2;

import java.util.Scanner;
//import java.util.Arrays;

public class UtilTab {
    public static String[] createTabString(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Entrez la longueur du tableau : ");
            int x = sc.nextInt();

            String[] tab;
            tab = new String[x];

            for (int i = 0; i < x; i++) {
                System.out.println("Entrez l'élément n° " + (i+1) + " : ");
                String s =  sc.next();
                tab[i] = s;
            }
        sc.close();
        return tab;
    }

    public static Double[] createTabDouble(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Entrez la longueur du tableau : ");
            int x = sc.nextInt();

            Double[] tab;
            tab = new Double[x];

            for (int i = 0; i < x; i++) {
                System.out.println("Entrez l'élément n° " + (i+1) + " : ");
                Double s =  sc.nextDouble();
                tab[i] = s;
            }
        sc.close();
        return tab;
    }

    public static void main(String[] args) {

    }
}
