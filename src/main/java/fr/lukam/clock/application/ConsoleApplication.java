package fr.lukam.clock.application;

import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.view.View;

public class ConsoleApplication implements Application {

    private final Controller clockController;
    private final View view;

    public ConsoleApplication(Controller clockController, View view) {
        this.clockController = clockController;
        this.view = view;
    }

    @Override
    public void run() {

        clockController.displayTime();
        this.view.display();

    }

}
