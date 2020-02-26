package fr.lukam.clock.infrastructure.presenters;

import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaFxPresenter implements Presenter {

    private final JavaFxViewModel viewModel;

    public JavaFxPresenter(JavaFxViewModel viewModel) {
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

        Color[] secondsColor = getColors(seconds);
        Color[] firstHoursLineColors = getColors(firstHoursLine);
        Color[] secondHoursLineColors = getColors(secondHoursLine);
        Color[] firstMinutesLineColors = getColors(firstMinutesLine);
        Color[] secondMinutesLineColors = getColors(secondMinutesLine);

        viewModel.colors = new Color[][]{
                secondsColor,
                firstHoursLineColors,
                secondHoursLineColors,
                firstMinutesLineColors,
                secondMinutesLineColors
        };
    }

    private Color[] getColors(String line) {
        return Arrays.stream(line.split(""))
                .map(letter -> letter.charAt(0))
                .map(this::getColor)
                .collect(Collectors.toList()).toArray(new Color[]{});
    }

    private Color getColor(char letter) {

        switch (letter) {

            case 'Y':
                return Color.YELLOW;

            case 'R':
                return Color.RED;

            default:
                return Color.LIGHTGRAY;

        }

    }

}
