package fr.lukam.clock.domain.berlinclock;

import fr.lukam.clock.domain.Clock;
import fr.lukam.clock.domain.model.Hours;
import fr.lukam.clock.domain.model.Minutes;
import fr.lukam.clock.domain.model.Seconds;
import fr.lukam.clock.domain.model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockTest {

    private Clock berlinClock;

    @Before
    public void setUp() {
        this.berlinClock = new BerlinClock();
    }

//    R
//    OOOO
//    OOOO
//    OOOOOOOOOOO
//    OOOO
//
//    R\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO

    @Test
    public void getTime_shouldReturnCommentAbove_whenTimeIs0H00Min00Sec() {

        Hours hours = new Hours(0);
        Minutes minutes = new Minutes(0);
        Seconds seconds = new Seconds(0);
        Time time = new Time(hours, minutes, seconds);

        String clockResponse = this.berlinClock.getTime(time);

        assertThat(clockResponse).isEqualTo("R\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO");
    }

//    O
//    RRRO
//    ROOO
//    YYRYYRYYRYO
//    OOOO
//
//    O\nRRRO\nROOO\nYYRYYRYYRYO\nOOOO

    @Test
    public void getTime_shouldReturnCommentAbove_whenTimeIs16H50Min07Sec() {

        Hours hours = new Hours(16);
        Minutes minutes = new Minutes(50);
        Seconds seconds = new Seconds(7);
        Time time = new Time(hours, minutes, seconds);

        String clockResponse = this.berlinClock.getTime(time);

        assertThat(clockResponse).isEqualTo("O\nRRRO\nROOO\nYYRYYRYYRYO\nOOOO");
    }

}
