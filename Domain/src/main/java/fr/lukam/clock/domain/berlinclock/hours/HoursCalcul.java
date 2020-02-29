package fr.lukam.clock.domain.berlinclock.hours;

import fr.lukam.clock.domain.model.Hours;

public abstract class HoursCalcul {

    public String getHours(Hours hours) {

        String redsLights = addRedsLights(hours);

        return new StringBuilder()
                .append(redsLights)
                .append(addBlacksLights(redsLights.length()))
                .toString();
    }

    protected abstract String addRedsLights(Hours hours);

    private String addBlacksLights(int length) {

        StringBuilder builder = new StringBuilder();

        for (int i = length; i < 4; i++) {

            builder.append("O");

        }

        return builder.toString();
    }

}
