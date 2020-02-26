package fr.lukam.clock.infrastructure.controllers;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Time;

import java.util.Scanner;

public class ConsoleController implements Controller {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final Clock clock;

    public ConsoleController(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void displayTime() {
        int hours = ask("heures");
        int minutes = ask("minutes");
        int seconds = ask("secondes");

        Time time = Time.from(hours, minutes, seconds);
        this.clock.displayTime(time);
    }

    private int ask(String element) {
        System.out.println("Entrez les " + element + " : ");
        return SCANNER.nextInt();
    }

}
