package fr.lukam.clock.infrastructure.controllers;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Time;

public class ClockController {

    private final Clock clock;

    public ClockController(Clock clock) {
        this.clock = clock;
    }

    public void displayTime(Time time) {
        this.clock.displayTime(time);
    }

}
