package fr.lukam.clock.domain.berlinclock.minutes;

import fr.lukam.clock.domain.model.Minutes;

public class SecondsLineMinutesCalcul {

    public String getMinutes(Minutes minutes) {

        String onLights = getOnLights(minutes);

        return new StringBuilder()
                .append(onLights)
                .append(getBlackLights(onLights.length()))
                .toString();
    }

    private String getOnLights(Minutes minutes) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < minutes.minutes % 5; i++) {

            builder.append("Y");

        }

        return builder.toString();
    }

    private String getBlackLights(int length) {

        StringBuilder builder = new StringBuilder();

        for (int i = length; i < 4; i++) {

            builder.append("O");

        }

        return builder.toString();
    }

}
