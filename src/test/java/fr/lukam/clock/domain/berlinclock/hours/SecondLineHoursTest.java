package fr.lukam.clock.domain.berlinclock.hours;

import fr.lukam.clock.domain.model.Hours;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondLineHoursTest {

    private SecondLineFirstLineHoursCalcul hoursCalcul;

    @Before
    public void setUp() {
        this.hoursCalcul = new SecondLineFirstLineHoursCalcul();
    }

    @Test
    public void getSecondHoursLine_shouldReturnOOOO_whenHoursAre0() {

        Hours hours = new Hours(0);

        String secondsResponse = this.hoursCalcul.getHours(hours);

        assertThat(secondsResponse).isEqualTo("OOOO");
    }

    @Test
    public void getSecondHoursLine_shouldReturnRRRR_whenHoursAre19() {

        Hours hours = new Hours(19);

        String secondsResponse = this.hoursCalcul.getHours(hours);

        assertThat(secondsResponse).isEqualTo("RRRR");
    }

}
