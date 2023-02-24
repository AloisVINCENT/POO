public class Point {
    String nom;
    // Les variables privées ne sont pas accessible ni modifiable depuis l'extérieur
    private int abscisse;
    private int ordonnée;

    // Le static s'éxecute directement et 1 seule fois
    static Point org = new Point(0, 0, "o");

    // Constructeur de Point
    public Point(int x, int y, String n) {
        nom = n;
        abscisse = x;
        ordonnée = y;
    }

    // On obtient les valeurs
    public int getAbs() {
        return abscisse;
    }

    public int getOrd() {
        return ordonnée;
    }

    // On obtient les valeurs par rapport à l'origine
    public int getX() {
        return abscisse - org.abscisse;
    }

    public int getY() {
        return ordonnée - org.ordonnée;
    }

    // On modifie les valeurs
    public void setAbs(int x) {
        abscisse = x;
    }

    public void setOrd(int y) {
        ordonnée = y;
    }

    // On vérifie si le point est inférieur ou égal au point en paramètre
    public boolean pegX(Point p) {
        return abscisse <= p.getAbs();
    }

    public boolean pegY(Point p) {
        return ordonnée <= p.getOrd();
    }

    public void translate(int x, int y) {
        abscisse = abscisse + x;
        ordonnée = ordonnée + y;
    }

    public String info() {
        return nom + "(" + getX() + "," + getY() + ")";
    }

    public void symetrie() {
        abscisse = org.abscisse - getX();
        ordonnée = org.ordonnée - getY();
    }
}
