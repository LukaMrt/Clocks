package fr.lukam.clock.application;

import fr.lukam.clock.domain.model.Time;
import fr.lukam.clock.infrastructure.ViewModel;
import fr.lukam.clock.infrastructure.controllers.ClockController;

import java.util.Scanner;

public class Application {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final ClockController clockController;
    private final ViewModel viewModel;

    public Application(ClockController clockController, ViewModel viewModel) {
        this.clockController = clockController;
        this.viewModel = viewModel;
    }

    public void run() {
        clockController.displayTime( askTime());

        System.out.println(String.join("\n", this.viewModel.text));
    }

    private Time askTime() {
        System.out.println("Entrez les heures : ");
        int hours = SCANNER.nextInt();

        System.out.println("Entrez les minutes : ");
        int minutes = SCANNER.nextInt();

        System.out.println("Entrez les secondes : ");
        int seconds = SCANNER.nextInt();

        return Time.from(hours, minutes, seconds);
    }

}
