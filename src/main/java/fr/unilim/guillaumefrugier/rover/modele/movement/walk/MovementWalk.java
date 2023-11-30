package fr.unilim.guillaumefrugier.rover.modele.movement.walk;

import fr.unilim.guillaumefrugier.rover.modele.Direction;
import fr.unilim.guillaumefrugier.rover.modele.PositionRover;

public interface MovementWalk {
    public void movement(PositionRover positionRover, Direction direction);
}
