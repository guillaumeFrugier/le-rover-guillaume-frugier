package fr.unilim.guillaumefrugier.rover.modele;

public class GridCase {
    private final int x;
    private final int y;
    public boolean isBlocked;

    GridCase(int x, int y){
        this.x = x;
        this.y = y;
        this.isBlocked = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
