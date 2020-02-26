package fr.lukam.clock.application;

import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class JavaFxApplication implements Application {

    private static final int PERIOD = 100;

    private final Controller clockController;
    private final View view;

    public JavaFxApplication(Controller clockController, View view) {
        this.clockController = clockController;
        this.view = view;
    }

    @Override
    public void run() {

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {

                if (!view.isRunning()) {
                    this.cancel();
                }

                clockController.displayTime();
                view.display();

            }

        }, 0, PERIOD);

    }

}
