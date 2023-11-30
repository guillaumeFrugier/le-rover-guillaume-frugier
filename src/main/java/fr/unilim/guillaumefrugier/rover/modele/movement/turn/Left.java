package fr.unilim.guillaumefrugier.rover.modele.movement.turn;

import fr.unilim.guillaumefrugier.rover.modele.Direction;

public class Left implements MovementTurn{

    @Override
    public Direction turn(Direction direction) {
        switch (direction){
            case WEST:
                direction = Direction.SOUTH;
                break;
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            default:
                return direction;
        }
        return direction;
    }
}
