package TD_3;

import java.util.Scanner;

public class td3 {

    /**
     * Client
     */
    public class Client {
        private int CIN;
        private String Nom;
        private String Prenom;
        private String Tel;

        public Client(int c, String n, String p, String t) {
            CIN = Math.max(0, c);
            Nom = n;
            Prenom = p;
            Tel = t;
        }

        public Client(int c, String n, String p) {
            CIN = Math.max(0, c);
            Nom = n;
            Prenom = p;
        }

        public void Print(Client c) {
            System.out.println("CIN = " + c.CIN);
            System.out.println("Nom = " + c.Nom);
            System.out.println("Prenom = " + c.Prenom);
            System.out.println("Tel = " + c.Tel);
        }
    }

    /**
     * Compte
     */
    public class Compte {
        private float Solde;
        private Client Proprietaire;

        public Compte(Client c, float s) {
            s = Math.max(0, s);
            Solde = s;
            Proprietaire = c;
        }

        public Compte(Client c) {
            Solde = 0;
            Proprietaire = c;
        }

        public void addSolde(float x) {
            x = Math.max(0, x);
            Solde = Solde + x;
        }

        public void decreaseSolde(float x) {
            x = Math.max(0, x);
            Solde = Solde - x;
        }

        public void Print(Compte c) {
            System.out.println("Nom = " + c.Proprietaire.Nom);
            System.out.println("Solde = " + c.Solde);
        }
    }

    /**
     * Main
     */
    public class Main {
        public Client setUpClient() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le CIN : ");
            int c = sc.nextInt();
            System.out.println("Entrez le Nom : ");
            String n = sc.next();
            System.out.println("Entrez le Prenom : ");
            String p = sc.next();
            System.out.println("Entrez le Telephone : ");
            String t = sc.next();
            sc.close();
            return new Client(c, n, p, t);
        }

        public Compte setUpCompte(Client c, float s) {
            return new Compte(c, s);
        }

        public Client findClient(Client[] c, int CIN) {
            for (int i = 0; i < c.length; i++) {
                if (c[i].CIN == CIN) {
                    return c[i];
                }
            }
            return null;
        }

        public Compte findCompte(Compte[] c, int CIN) {
            for (int i = 0; i < c.length; i++) {
                if (c[i].Proprietaire.CIN == CIN) {
                    return c[i];
                }
            }
            return null;
        }

        public void debite(Compte[] c, int CIN, float s) {
            findCompte(c, CIN).decreaseSolde(s);
        }

        public void credite(Compte[] c, int CIN, float s) {
            findCompte(c, CIN).addSolde(s);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le nombre de client :");
            int n = sc.nextInt();
            Client[] c = new Client[n];
            for (int i = 0; i < n; i++) {
                c[i] = Main.setUpClient();
            }
        }

    }
}
