package fr.unilim.guillaumefrugier.rover.modele;

import fr.unilim.guillaumefrugier.rover.modele.movement.Movement;
import fr.unilim.guillaumefrugier.rover.modele.pattern.FacadeRover;

public class Rover {
    private Mars mars;
    private PositionRover position;
    private CommandeRover commandeRover;
    private Direction direction;


    public Rover(Mars mars){
        this.mars = mars;
        this.position = new PositionRover(this.mars);
        this.commandeRover = new CommandeRover();
        this.direction = Direction.NORTH;
        this.position.theRoverHasLanded();
    }

    public void awaitingOrder(String command){
        this.commandeRover.transmission(command,position, direction);
    }
}
