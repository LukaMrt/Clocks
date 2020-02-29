package fr.lukam.clock.domain.berlinclock.minutes;

import fr.lukam.clock.domain.model.Minutes;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstLineMinutesTest {

    private FirstLineMinutesCalcul minutesCalcul;

    @Before
    public void setUp() {
        this.minutesCalcul = new FirstLineMinutesCalcul();
    }

    @Test
    public void getFirstHoursLine_shouldReturnOOOOOOOOOOO_whenHoursAre0() {

        Minutes minutes = new Minutes(0);

        String minutesResponse = this.minutesCalcul.getMinutes(minutes);

        assertThat(minutesResponse).isEqualTo("OOOOOOOOOOO");
    }

    @Test
    public void getFirstHoursLine_shouldReturnYYRYOOOOOOO_whenHoursAre23() {

        Minutes minutes = new Minutes(23);

        String minutesResponse = this.minutesCalcul.getMinutes(minutes);

        assertThat(minutesResponse).isEqualTo("YYRYOOOOOOO");
    }

}
