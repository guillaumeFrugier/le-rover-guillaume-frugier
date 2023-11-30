package fr.unilim.guillaumefrugier.rover.modele.movement.walk;

import fr.unilim.guillaumefrugier.rover.modele.Direction;
import fr.unilim.guillaumefrugier.rover.modele.GridCase;
import fr.unilim.guillaumefrugier.rover.modele.PositionRover;

public class Backward implements MovementWalk{
    @Override
    public void movement(PositionRover positionRover, Direction direction) {
        GridCase actualPosition = positionRover.positionRoverNow();
        int tempY = actualPosition.getY();
        int tempX = actualPosition.getX();
        switch (direction){
            case SOUTH:
                tempY--;
                break;
            case NORTH:
                tempY++;
                break;
            case EAST:
                tempX++;
                break;
            case WEST:
                tempX--;
                break;

        }
        positionRover.setPositionRover(tempX,tempY);
    }
}
