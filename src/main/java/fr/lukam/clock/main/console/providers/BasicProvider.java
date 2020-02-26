package fr.lukam.clock.main.console.providers;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.application.ConsoleApplication;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.infrastructure.controllers.ConsoleController;
import fr.lukam.clock.infrastructure.controllers.Controller;
import fr.lukam.clock.infrastructure.model.ConsoleViewModel;
import fr.lukam.clock.infrastructure.presenters.Presenter;
import fr.lukam.clock.infrastructure.presenters.ConsolePresenter;
import fr.lukam.clock.view.ConsoleView;
import fr.lukam.clock.view.View;

public class BasicProvider implements ConsoleProvider {

    private static final ConsoleViewModel VIEW_MODEL = new ConsoleViewModel();

    private static final View VIEW = new ConsoleView(VIEW_MODEL);

    private static final Presenter CLOCK_PRESENTER = new ConsolePresenter(VIEW_MODEL);

    private static final Clock CLOCK = new BerlinClock(CLOCK_PRESENTER);

    private static final Controller CLOCK_CONTROLLER = new ConsoleController(CLOCK);

    private static final Application APPLICATION = new ConsoleApplication(CLOCK_CONTROLLER, VIEW);

    @Override
    public Application getApplication() {
        return APPLICATION;
    }

}
