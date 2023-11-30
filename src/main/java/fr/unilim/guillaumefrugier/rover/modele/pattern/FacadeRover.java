package fr.unilim.guillaumefrugier.rover.modele.pattern;

import fr.unilim.guillaumefrugier.rover.modele.Direction;
import fr.unilim.guillaumefrugier.rover.modele.PositionRover;
import fr.unilim.guillaumefrugier.rover.modele.movement.turn.Left;
import fr.unilim.guillaumefrugier.rover.modele.movement.turn.MovementTurn;
import fr.unilim.guillaumefrugier.rover.modele.movement.turn.Right;
import fr.unilim.guillaumefrugier.rover.modele.movement.walk.Backward;
import fr.unilim.guillaumefrugier.rover.modele.movement.walk.Forward;
import fr.unilim.guillaumefrugier.rover.modele.movement.walk.MovementWalk;

public class FacadeRover {
    private final MovementTurn moveRight;
    private final MovementTurn moveLeft;
    private final MovementWalk moveForward;
    private final MovementWalk moveBackward;

    public FacadeRover() {
        this.moveRight = new Right();
        this.moveLeft = new Left();
        this.moveForward = new Forward();
        this.moveBackward = new Backward();
    }

    public void forwardMove(PositionRover positionRover, Direction direction){
        this.moveForward.movement(positionRover, direction);
    }

    public void backwardMove(PositionRover positionRover, Direction direction){
        this.moveBackward.movement(positionRover, direction);
    }

    public void leftMove(Direction direction){
        this.moveLeft.turn(direction);
    }

    public void rightMove(Direction direction){
        this.moveRight.turn(direction);
    }
}
