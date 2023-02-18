package TD_3;
    /**
     * Main
     */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nombre de client :");
    int n = sc.nextInt();
    Client[] c = new Client[n];
    for (int i = 0; i < n; i++) {
        c[i] = Main.setUpClient();
    }
}
