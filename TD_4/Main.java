public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3, "a");
        Point p2 = new Point(4, 1, "b");
        Point p3 = new Point(-1, 2, "c");
        // On récupère l'attribut statique qui est associé à tous les autres attributs et on le modifie
        p1.org = p2;
        // C'est équivalant mais plus logique de le faire depuis la classe

        p3.symetrie();

        System.out.println(Point.org.info());
        System.out.println(Point.org.info());

        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p1, p3);
        System.out.println(r1.info());
        System.out.println(r2.info());
        System.out.println(r1.surface());
        System.out.println(r2.surface());
    }
}
