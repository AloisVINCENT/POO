package TD_1;

import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entrez le numéro du jour :");
            int j = sc.nextInt();
            System.out.println("Entrez le numéro du mois :");
            int m = sc.nextInt();
            System.out.println("Entrez le numéro de l'année :");
            int a = sc.nextInt();
            
            // Cas des mois a 31j
            if (j == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) {
                j = 1;
                m++;
            // Cas des mois a 30j
            } else if (j == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                j = 1;
                m++;
            // Cas de fevrier bisextile
            } else if (m == 2 && j == 29 && (a % 4 == 0 && a % 400 != 0)) {
                j = 1;
                m++;
            // Cas de fevrier non-bisextile
            } else if (m == 2 && j == 28 && !(a % 4 == 0 && a % 400 != 0)) {
                j = 1;
                m++;
            // Cas de la fin d'annee
            } else if (m == 12 && j == 31) {
                j = 1;
                m = 1;
                a++;
            // Tous les autres cas
            } else {
                j++;
            }
            System.out.println("Le lendemain est " + j + "/" + m + "/" + a);
        }
    }
}
