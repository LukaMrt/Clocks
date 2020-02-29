package fr.lukam.clock.infrastructure.presenters;

import fr.lukam.clock.domain.Presenter;
import fr.lukam.clock.infrastructure.View;
import fr.lukam.clock.infrastructure.model.JavaFxViewModel;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaFxPresenter implements Presenter {

    private final View view;
    private final JavaFxViewModel viewModel;

    public JavaFxPresenter(View view, JavaFxViewModel viewModel) {
        this.view = view;
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

        String[] secondsColor = getColorsStrings(seconds);
        String[] firstHoursLineColors = getColorsStrings(firstHoursLine);
        String[] secondHoursLineColors = getColorsStrings(secondHoursLine);
        String[] firstMinutesLineColors = getColorsStrings(firstMinutesLine);
        String[] secondMinutesLineColors = getColorsStrings(secondMinutesLine);

        this.viewModel.colors = new String[][]{
                secondsColor,
                firstHoursLineColors,
                secondHoursLineColors,
                firstMinutesLineColors,
                secondMinutesLineColors
        };

        this.view.display();
    }

    private String[] getColorsStrings(String line) {
        return Arrays.stream(line.split(""))
                .map(letter -> letter.charAt(0))
                .map(this::getColorString)
                .collect(Collectors.toList()).toArray(new String[]{});
    }

    private String getColorString(char letter) {

        switch (letter) {

            case 'Y':
                return "Yellow";

            case 'R':
                return "Red";

            default:
                return "LightGray";

        }

    }

}
