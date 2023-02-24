public class Dessin {
    Rectangle[] tab = new Rectangle[0];

    public void ajout(Rectangle rec) {
        Rectangle[] temp = new Rectangle[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            temp[i] = tab[i];
        }
        temp[temp.length - 1] = rec;
        tab = temp;
    }
    
    public void symetrie(){
        for (int i = 0; i < tab.length; i++) {
            tab[i].symetrie();
        }
    }

    public void translate(int x, int y){
        for (int i = 0; i < tab.length; i++) {
            tab[i].translate(x, y);
        }
    }

    public void affiche(){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i].info());
        }
    }

    public int surface(){
        if (tab.length == 0) {
            return 0;  
        }
        //demander à Erwann
    }


}
