package fr.lukam.clock.domain.berlinclock.minutes;

import fr.lukam.clock.domain.model.Minutes;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondLineMinutesTest {

    private SecondsLineMinutesCalcul minutesCalcul;

    @Before
    public void setUp() {
        this.minutesCalcul = new SecondsLineMinutesCalcul();
    }

    @Test
    public void getFirstHoursLine_shouldReturn0000_whenHoursAre0() {

        Minutes minutes = new Minutes(0);

        String minutesResponse = this.minutesCalcul.getMinutes(minutes);

        assertThat(minutesResponse).isEqualTo("OOOO");
    }

    @Test
    public void getFirstHoursLine_shouldReturnYOOO_whenHoursAre6() {

        Minutes minutes = new Minutes(6);

        String minutesResponse = this.minutesCalcul.getMinutes(minutes);

        assertThat(minutesResponse).isEqualTo("YOOO");
    }

}
