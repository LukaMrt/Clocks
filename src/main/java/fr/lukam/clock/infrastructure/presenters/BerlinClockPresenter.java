package fr.lukam.clock.infrastructure.presenters;

import fr.lukam.clock.infrastructure.ViewModel;

public class BerlinClockPresenter implements ClockPresenter {

    private final ViewModel viewModel;

    public BerlinClockPresenter(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentTime(String time) {

        String[] timeArray = time.split(" ");

        String seconds = timeArray[0];
        String firstHoursLine = timeArray[1];
        String secondHoursLine = timeArray[2];
        String firstMinutesLine = timeArray[3];
        String secondMinutesLine = timeArray[4];

        seconds = "               " + seconds;
        firstHoursLine = String.join("      ", firstHoursLine.split(""));
        secondHoursLine = String.join("      ", secondHoursLine.split(""));
        firstMinutesLine = String.join("  ", firstMinutesLine.split(""));
        secondMinutesLine = String.join("      ", secondMinutesLine.split(""));

        timeArray[0] = seconds;
        timeArray[1] = "    " + firstHoursLine;
        timeArray[2] = "    " + secondHoursLine;
        timeArray[3] = firstMinutesLine;
        timeArray[4] = "    " + secondMinutesLine;

        viewModel.text = timeArray;
    }

}
