package fr.lukam.clock.domain.berlinclock;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.Presenter;
import fr.lukam.clock.domain.model.Time;
import fr.lukam.clock.domain.berlinclock.hours.FirstLineHoursCalcul;
import fr.lukam.clock.domain.berlinclock.hours.HoursCalcul;
import fr.lukam.clock.domain.berlinclock.hours.SecondLineFirstLineHoursCalcul;
import fr.lukam.clock.domain.berlinclock.minutes.FirstLineMinutesCalcul;
import fr.lukam.clock.domain.berlinclock.minutes.SecondsLineMinutesCalcul;
import fr.lukam.clock.domain.berlinclock.seconds.SecondsCalcul;

public class BerlinClock implements Clock {

    private final Presenter presenter;

    private final SecondsCalcul secondsCalcul;
    private final HoursCalcul firstLineHoursCalcul;
    private final HoursCalcul secondLineHoursCalcul;
    private final FirstLineMinutesCalcul firstLineMinutesCalcul;
    private final SecondsLineMinutesCalcul secondsLineMinutesCalcul;

    public BerlinClock(Presenter presenter) {
        this.presenter = presenter;
        this.secondsCalcul = new SecondsCalcul();
        this.firstLineHoursCalcul = new FirstLineHoursCalcul();
        this.secondLineHoursCalcul = new SecondLineFirstLineHoursCalcul();
        this.firstLineMinutesCalcul = new FirstLineMinutesCalcul();
        this.secondsLineMinutesCalcul = new SecondsLineMinutesCalcul();
    }

    @Override
    public void displayTime(Time time) {

        this.presenter.presentTime(new StringBuilder()
                .append(this.secondsCalcul.getSeconds(time.seconds))
                .append(" ")
                .append(this.firstLineHoursCalcul.getHours(time.hours))
                .append(" ")
                .append(this.secondLineHoursCalcul.getHours(time.hours))
                .append(" ")
                .append(this.firstLineMinutesCalcul.getMinutes(time.minutes))
                .append(" ")
                .append(this.secondsLineMinutesCalcul.getMinutes(time.minutes))
                .toString());
    }

}
