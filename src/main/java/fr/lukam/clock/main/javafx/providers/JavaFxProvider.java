package fr.lukam.clock.main.javafx;

import fr.lukam.clock.application.Application;
import javafx.stage.Stage;

public interface JavaFxProvider {

    Application buildApplication(Stage primaryStage);

}
