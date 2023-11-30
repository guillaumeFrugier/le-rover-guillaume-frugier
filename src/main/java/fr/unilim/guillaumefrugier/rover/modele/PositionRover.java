package fr.unilim.guillaumefrugier.rover.modele;



public class PositionRover {
    private Mars mars;
    private int positionRoverX;
    private int positionRoverY;


    public PositionRover(Mars mars){
        this.mars = mars;
        this.positionRoverX = 2;
        this.positionRoverY = 2;
    }
    public void theRoverHasLanded(){
        this.mars.getMarsGround().get(2).get(2);
    }

    public void setPositionRover(int newPositionRoverX, int newPositionRoverY){
        this.mars.getMarsGround().get(newPositionRoverY).get(newPositionRoverX);
        this.positionRoverX = newPositionRoverX;
        this.positionRoverY = newPositionRoverY;
    }
    public GridCase positionRoverNow(){
        return mars.getMarsGround().get(this.positionRoverY).get(this.positionRoverX);
    }
}
