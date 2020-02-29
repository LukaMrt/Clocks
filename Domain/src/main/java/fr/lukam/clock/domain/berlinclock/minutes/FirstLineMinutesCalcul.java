package fr.lukam.clock.domain.berlinclock.minutes;

import fr.lukam.clock.domain.model.Minutes;

public class FirstLineMinutesCalcul {

    public String getMinutes(Minutes minutes) {

        String onLights = addOnLights(minutes);

        return new StringBuilder()
                .append(onLights)
                .append(addOffLights(onLights.length()))
                .toString();
    }

    private String addOnLights(Minutes minutes) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < minutes.minutes / 5; i++) {

            String color = getLightColor(builder);
            builder.append(color);

        }

        return builder.toString();
    }

    private String getLightColor(StringBuilder builder) {

        boolean threeLights = (builder.length() + 1) % 3 == 0;
        boolean builderEmpty = builder.length() != 0;

        if (threeLights && builderEmpty) {
            return "R";
        }

        return "Y";
    }

    private String addOffLights(int length) {

        StringBuilder builder = new StringBuilder();

        for (int i = length; i < 11; i++) {

            builder.append("O");

        }

        return builder.toString();
    }

}
