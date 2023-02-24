public class Rectangle {
    String name;
    Point p1;
    Point p2;

    public Rectangle(Point a, Point b) {
        p1 = a;
        p2 = b;
        name = a.nom + b.nom;
    }

    public int getPPAbs() {
        return Math.min(p1.getAbs(), p2.getAbs());
    }

    public int getPGAbs() {
        return Math.max(p1.getAbs(), p2.getAbs());
    }

    public int getPPOrd() {
        return Math.min(p1.getOrd(), p2.getOrd());
    }

    public int getPGOrd() {
        return Math.max(p1.getOrd(), p2.getOrd());
    }

    public int surface() {
        return (getPGAbs() - getPPAbs()) * (getPGOrd() - getPPOrd());
    }

    public void symetrie() {
        p1.symetrie();
        p2.symetrie();
    }

    public void translate(int x, int y) {
        p1.translate(x, y);
        p2.translate(x, y);
    }

    public String info() {
        return name + "[" + p1.info() + ";" + p2.info() + "]";
    }
}
