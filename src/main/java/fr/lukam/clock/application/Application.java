package fr.lukam.clock.application;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Time;
import java.util.Scanner;

public class Application {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final Clock clock;

    public Application(Clock clock) {
        this.clock = clock;
    }

    public void run() {

        System.out.println("Entrez les heures : ");
        int hours = SCANNER.nextInt();

        System.out.println("Entrez les minutes : ");
        int minutes = SCANNER.nextInt();

        System.out.println("Entrez les secondes : ");
        int seconds = SCANNER.nextInt();

        Time time = Time.from(hours, minutes, seconds);
        System.out.println(clock.getTime(time));

    }

}
