package fr.lukam.clock.domain.berlinclock;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Hours;
import fr.lukam.clock.domain.model.Minutes;
import fr.lukam.clock.domain.model.Seconds;
import fr.lukam.clock.domain.model.Time;
import fr.lukam.clock.infrastructure.ViewModel;
import fr.lukam.clock.infrastructure.presenters.BerlinClockPresenter;
import fr.lukam.clock.infrastructure.presenters.ClockPresenter;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockTest {

    private ViewModel viewModel;
    private Clock berlinClock;

    @Before
    public void setUp() {
        this.viewModel = new ViewModel();
        ClockPresenter clockPresenter = new BerlinClockPresenter(viewModel);
        this.berlinClock = new BerlinClock(clockPresenter);
    }

//    R
//    OOOO
//    OOOO
//    OOOOOOOOOOO
//    OOOO
//
//    R OOOO OOOO OOOOOOOOOOO OOOO

    @Test
    public void displayTime_shouldSetViewModelToCommentAbove_whenTimeIs0H00Min00Sec() {

        Hours hours = new Hours(0);
        Minutes minutes = new Minutes(0);
        Seconds seconds = new Seconds(0);
        Time time = new Time(hours, minutes, seconds);

        this.berlinClock.displayTime(time);
        String clockResponse = String.join(" ", this.viewModel.text);

        assertThat(clockResponse).isEqualTo("R OOOO OOOO OOOOOOOOOOO OOOO");
    }

//    O
//    RRRO
//    ROOO
//    YYRYYRYYRYO
//    OOOO
//
//    O RRRO ROOO YYRYYRYYRYO OOOO

    @Test
    public void displayTime_shouldSetViewModelToCommentAbove_whenTimeIs16H50Min07Sec() {

        Hours hours = new Hours(16);
        Minutes minutes = new Minutes(50);
        Seconds seconds = new Seconds(7);
        Time time = new Time(hours, minutes, seconds);

        this.berlinClock.displayTime(time);
        String clockResponse = String.join(" ", this.viewModel.text);

        assertThat(clockResponse).isEqualTo("O RRRO ROOO YYRYYRYYRYO OOOO");
    }

}
