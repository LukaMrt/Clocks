package fr.lukam.clock.application;

import fr.lukam.clock.infrastructure.View;
import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.view.javafx.model.RunState;

import java.util.concurrent.*;

public class JavaFxApplication implements Application {

    private static final int PERIOD_MILLIS = 100;

    private final Controller controller;
    private final View view;
    private final RunState runState;

    public JavaFxApplication(Controller controller, View view, RunState runState) {
        this.controller = controller;
        this.view = view;
        this.runState = runState;
    }

    @Override
    public void run() {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
        pool.scheduleAtFixedRate(() -> displayClock(pool), 0, PERIOD_MILLIS, TimeUnit.MILLISECONDS);

    }

    private void displayClock(ScheduledExecutorService pool) {
        if (!runState.isRunning()) {
            pool.shutdown();
        }

        controller.displayTime();
        view.display();
    }

}
