package fr.unilim.guillaumefrugier.rover.modele;

import fr.unilim.guillaumefrugier.rover.modele.pattern.FacadeRover;

import java.util.ArrayList;
import java.util.List;

public class CommandeRover {
    private FacadeRover facadeRover;


    private List<Character> decompCommand;

    public CommandeRover(){
        this.facadeRover = new FacadeRover();
        this.decompCommand = new ArrayList<>();
    }

    public void transmission(String command, PositionRover positionRover, Direction direction){

        for (char charCommand: command.toCharArray()) {
            decompCommand.add(charCommand);

            for (Character charac: decompCommand) {
                switch (charac){
                    case 'f':
                        facadeRover.forwardMove(positionRover, direction);
                        break;
                    case 'b':
                        facadeRover.backwardMove(positionRover, direction);
                        break;
                    case 'r':
                        facadeRover.rightMove(direction);
                        break;
                    case 'l':
                        facadeRover.leftMove(direction);
                        break;

                }
            }}



    }
}
