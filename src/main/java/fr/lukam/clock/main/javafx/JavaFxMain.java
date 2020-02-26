package fr.lukam.clock.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxMain extends Application {

    private static final JavaFxObjects PROVIDER = new JavaFxObjects();

    public static void main(String[] args) {

        Application.launch(JavaFxMain.class);
    }

    @Override
    public void start(Stage primaryStage) {

        fr.lukam.clock.application.Application application = PROVIDER.buildApplication(primaryStage);
        application.run();

        primaryStage.show();
    }

}
