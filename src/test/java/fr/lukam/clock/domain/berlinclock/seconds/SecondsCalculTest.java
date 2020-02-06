package fr.lukam.clock.domain.berlinclock.seconds;

import fr.lukam.clock.domain.model.Seconds;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondsCalculTest {

    private SecondsCalcul secondsCalcul;

    @Before
    public void setUp() {
        this.secondsCalcul = new SecondsCalcul();
    }

    @Test
    public void getSeconds_shouldReturnR_whenSecondsAre2() {

        Seconds seconds = new Seconds(2);

        String secondsResponse = this.secondsCalcul.getSeconds(seconds);

        assertThat(secondsResponse).isEqualTo("R");
    }

    @Test
    public void getSeconds_shouldReturnO_whenSecondsAre1() {

        Seconds seconds = new Seconds(1);

        String secondsResponse = this.secondsCalcul.getSeconds(seconds);

        assertThat(secondsResponse).isEqualTo("O");
    }

}
