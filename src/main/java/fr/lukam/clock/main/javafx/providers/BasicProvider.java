package fr.lukam.clock.main.javafx;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.application.JavaFxApplication;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.infrastructure.controllers.ConsoleController;
import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import fr.lukam.clock.infrastructure.presenters.ClockPresenter;
import fr.lukam.clock.infrastructure.presenters.JavaFxPresenter;
import fr.lukam.clock.view.javafx.JavaFxView;
import fr.lukam.clock.view.View;
import javafx.stage.Stage;

public class BasicProvider implements JavaFxProvider {

    private final JavaFxViewModel VIEW_MODEL = new JavaFxViewModel();

    private final ClockPresenter CLOCK_PRESENTER = new JavaFxPresenter(VIEW_MODEL);

    private final Clock CLOCK = new BerlinClock(CLOCK_PRESENTER);

    private final ConsoleController CLOCK_CONTROLLER = new ConsoleController(CLOCK);

    @Override
    public Application buildApplication(Stage primaryStage) {

        View view = new JavaFxView(VIEW_MODEL, primaryStage);
        return new JavaFxApplication(CLOCK_CONTROLLER, view);
    }

}
