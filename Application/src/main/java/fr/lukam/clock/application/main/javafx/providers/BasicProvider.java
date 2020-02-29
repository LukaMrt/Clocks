package fr.lukam.clock.application.main.javafx.providers;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.application.JavaFxApplication;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.Presenter;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.infrastructure.View;
import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.infrastructure.controllers.JavaFxController;
import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import fr.lukam.clock.infrastructure.presenters.JavaFxPresenter;
import fr.lukam.clock.view.javafx.JavaFxView;
import fr.lukam.clock.view.javafx.model.RunState;
import javafx.stage.Stage;

public class BasicProvider implements JavaFxProvider {

    @Override
    public Application buildApplication(Stage primaryStage) {

        JavaFxViewModel viewModel = new JavaFxViewModel();
        RunState runState = new RunState();

        View view = new JavaFxView(viewModel, primaryStage, runState);
        Presenter presenter = new JavaFxPresenter(view, viewModel);
        Clock berlinClock = new BerlinClock(presenter);
        Controller controller = new JavaFxController(berlinClock);

        return new JavaFxApplication(controller, view, runState);
    }

}
