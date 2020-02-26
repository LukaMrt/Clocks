package fr.lukam.clock.main.console;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.application.ConsoleApplication;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.infrastructure.controllers.ConsoleController;
import fr.lukam.clock.infrastructure.model.ConsoleViewModel;
import fr.lukam.clock.infrastructure.presenters.ClockPresenter;
import fr.lukam.clock.infrastructure.presenters.ConsolePresenter;
import fr.lukam.clock.view.ConsoleView;
import fr.lukam.clock.view.View;

public class ConsoleObjects implements ConsoleProvider {

    private final ConsoleViewModel VIEW_MODEL = new ConsoleViewModel();

    private final View VIEW = new ConsoleView(VIEW_MODEL);

    private final ClockPresenter CLOCK_PRESENTER = new ConsolePresenter(VIEW_MODEL);

    private final Clock CLOCK = new BerlinClock(CLOCK_PRESENTER);

    private final ConsoleController CLOCK_CONTROLLER = new ConsoleController(CLOCK);

    private final Application APPLICATION = new ConsoleApplication(CLOCK_CONTROLLER, VIEW);

    @Override
    public Application getApplication() {
        return APPLICATION;
    }

}
