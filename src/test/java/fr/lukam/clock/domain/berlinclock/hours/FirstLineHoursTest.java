package fr.lukam.clock.domain.berlinclock.hours;

import fr.lukam.clock.domain.model.Hours;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstLineHoursTest {

    private FirstLineHoursCalcul hoursCalcul;

    @Before
    public void setUp() {
        this.hoursCalcul = new FirstLineHoursCalcul();
    }

    @Test
    public void getFirstHoursLine_shouldReturnOOOO_whenHoursAre0() {

        Hours hours = new Hours(0);

        String hoursResponse = this.hoursCalcul.getHours(hours);

        assertThat(hoursResponse).isEqualTo("OOOO");
    }

    @Test
    public void getFirstHoursLine_shouldReturnRROO_whenHoursAre9() {

        Hours hours = new Hours(9);

        String hoursResponse = this.hoursCalcul.getHours(hours);

        assertThat(hoursResponse).isEqualTo("ROOO");
    }

    @Test
    public void getFirstHoursLine_shouldReturnRRRO_whenHoursAre16() {

        Hours hours = new Hours(16);

        String hoursResponse = this.hoursCalcul.getHours(hours);

        assertThat(hoursResponse).isEqualTo("RRRO");
    }

}
