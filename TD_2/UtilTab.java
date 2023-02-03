package TD_2;

import java.util.Scanner;

public class UtilTab {

    public static void main(String[] args) {
        Double tab1[] = createTab();
        afficher(tab1);
        insert(tab1, 3);
        afficher(tab1);
    }

    public static Double[] createTab() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur du tableau : ");
        int x = sc.nextInt();
        if (x < 0) {
            x = 0;
        }

        Double[] tab;
        tab = new Double[x];
        if (x != 0) {
            for (int i = 0; i < x; i++) {
                System.out.println("Entrez l'élément n° " + (i + 1) + " : ");
                Double s = sc.nextDouble();
                tab[i] = s;
            }
        }
        return tab;
    }

    public static void afficher(Double[] tab) {
        if (tab.length != 0) {
            String content = "[";
            for (int i = 0; i < tab.length; i++) {
                if (i == tab.length - 1) {
                    content = content + tab[i] + "]";
                } else {
                    content = content + tab[i] + ", ";
                }
            }
            System.out.println(content);
        } else {
            System.out.println("[]");
        }
    }

    public static void copyZone(Double[] tab1, Double[] tab2, int i1deb, int i1fin, int i2deb) {
        i1deb = Math.max(0,i1deb);
        i1deb = Math.min(i1deb, tab1.length);

        i1fin = Math.max(-1,i1fin);
        i1fin = Math.min(i1fin, tab1.length-1);

        i2deb = Math.max(0,i2deb);
        i2deb = Math.min(i2deb, tab2.length);

        int nb = i1fin - i1deb +1;
        nb = Math.min(nb, tab2.length-i2deb);

        for (int i = 0; i < nb; i++) {
            tab2[i2deb+i] = tab1[i1deb+i];
        }
    }

    public static Double[] agrandir(Double[] tab, int i) {
        Double[] tabA = new Double[Math.max(0,tab.length+i)];
        copyZone(tab, tabA, 0, tab.length-1,0);
        return tabA;
    }

    public static Double[] fusion(Double[] tab1, Double[] tab2) {
        return null;
    }

    public static Double[] insert(Double[] tab, int i) {
        Double[] tabI = new Double[Math.max(0,tab.length)];
        copyZone(tab, tabI, 0, tab.length, i);
        return tabI;
    }

    public static Double[] supprLength(Double[] tab, int i) {
        return null;
    }

    public static Double[] supprItem(Double[] tab, Double i) {
        return null;
    }
}