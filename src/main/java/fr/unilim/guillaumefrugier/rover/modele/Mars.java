package fr.unilim.guillaumefrugier.rover.modele;

import java.util.ArrayList;
import java.util.List;

public class Mars {
    private List<List<GridCase>> marsGround;


    public Mars(){
        this.marsGround = new ArrayList<List<GridCase>>();
        for (int i = 0; i < 100; i++) {
            this.marsGround.add(new ArrayList<>());
        }
        generationGrid();
    }

    private void generationGrid() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                this.marsGround.get(i).add(new GridCase(j,i));
            }
        }
    }



    public List<List<GridCase>> getMarsGround() {
        return marsGround;
    }
}
