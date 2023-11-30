package fr.unilim.guillaumefrugier.rover.modele.movement.turn;

import fr.unilim.guillaumefrugier.rover.modele.Direction;

public class Right implements MovementTurn{
    @Override
    public Direction turn(Direction direction) {
        switch (direction){
            case WEST:
                direction = Direction.NORTH;
                break;
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            default:
                return direction;
        }
        return direction;
    }
}
