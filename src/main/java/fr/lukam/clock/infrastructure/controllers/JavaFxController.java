package fr.lukam.clock.infrastructure.controllers;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Time;

import java.time.LocalDateTime;

public class JavaFxController implements Controller {

    private final Clock clock;

    public JavaFxController(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void displayTime() {

        LocalDateTime date = LocalDateTime.now();
        Time time = Time.from(date.getHour(), date.getMinute(), date.getSecond());
        this.clock.displayTime(time);

    }

}
