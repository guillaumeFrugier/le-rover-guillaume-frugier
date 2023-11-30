package fr.unilim.guillaumefrugier.rover.main;

import fr.unilim.guillaumefrugier.rover.modele.Mars;
import fr.unilim.guillaumefrugier.rover.modele.Rover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mars mars = new Mars();
        Rover rover = new Rover(mars);
        Scanner scan = new Scanner(System.in);
        String command = scan.next();
        rover.awaitingOrder(command);

    }
}
