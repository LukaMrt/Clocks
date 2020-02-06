package fr.lukam.clock.application;

import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.domain.Clock;

public class Main {

    private static final Clock CLOCK = new BerlinClock();

    public static void main(String[] args) {

        Application application = new Application(CLOCK);
        application.run();

    }

}
