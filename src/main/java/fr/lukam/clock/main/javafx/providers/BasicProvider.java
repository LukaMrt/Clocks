package fr.lukam.clock.main.javafx.providers;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.application.JavaFxApplication;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.infrastructure.controllers.JavaFxController;
import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import fr.lukam.clock.infrastructure.presenters.Presenter;
import fr.lukam.clock.infrastructure.presenters.JavaFxPresenter;
import fr.lukam.clock.view.javafx.JavaFxView;
import fr.lukam.clock.view.View;
import javafx.stage.Stage;

public class BasicProvider implements JavaFxProvider {

    private static final JavaFxViewModel VIEW_MODEL = new JavaFxViewModel();

    private static final Presenter CLOCK_PRESENTER = new JavaFxPresenter(VIEW_MODEL);

    private static final Clock CLOCK = new BerlinClock(CLOCK_PRESENTER);

    private static final Controller CLOCK_CONTROLLER = new JavaFxController(CLOCK);

    @Override
    public Application buildApplication(Stage primaryStage) {

        View view = new JavaFxView(VIEW_MODEL, primaryStage);
        return new JavaFxApplication(CLOCK_CONTROLLER, view);
    }

}
