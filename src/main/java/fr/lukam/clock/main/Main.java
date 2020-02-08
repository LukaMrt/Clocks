package fr.lukam.clock.main;

import fr.lukam.clock.application.Application;
import fr.lukam.clock.domain.berlinclock.BerlinClock;
import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.infrastructure.ViewModel;
import fr.lukam.clock.infrastructure.controllers.ClockController;
import fr.lukam.clock.infrastructure.presenters.BerlinClockPresenter;
import fr.lukam.clock.infrastructure.presenters.ClockPresenter;

public class Main {

    public static final ViewModel VIEW_MODEL = new ViewModel();
    public static final ClockPresenter CLOCK_PRESENTER = new BerlinClockPresenter(VIEW_MODEL);
    private static final Clock CLOCK = new BerlinClock(CLOCK_PRESENTER);
    public static final ClockController CLOCK_CONTROLLER = new ClockController(CLOCK);

    public static void main(String[] args) {

        Application application = new Application(CLOCK_CONTROLLER, VIEW_MODEL);

        application.run();

    }

}
