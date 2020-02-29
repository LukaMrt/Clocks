package fr.lukam.clock.domain.berlinclock.seconds;

import fr.lukam.clock.domain.model.Seconds;

public class SecondsCalcul {

    public String getSeconds(Seconds seconds) {

        if (seconds.second % 2 == 0) {
            return "R";
        }

        return "O";
    }

}
