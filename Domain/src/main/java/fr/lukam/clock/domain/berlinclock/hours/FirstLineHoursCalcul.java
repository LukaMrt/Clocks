package fr.lukam.clock.domain.berlinclock.hours;

import fr.lukam.clock.domain.model.Hours;

public class FirstLineHoursCalcul extends HoursCalcul {

    @Override
    protected String addRedsLights(Hours hours) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < hours.hours / 5; i++) {

            builder.append("R");

        }

        return builder.toString();
    }

}
