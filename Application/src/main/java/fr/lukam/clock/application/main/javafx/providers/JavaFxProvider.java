package fr.lukam.clock.application.main.javafx.providers;

import fr.lukam.clock.application.Application;
import javafx.stage.Stage;

public interface JavaFxProvider {

    Application buildApplication(Stage primaryStage);

}
