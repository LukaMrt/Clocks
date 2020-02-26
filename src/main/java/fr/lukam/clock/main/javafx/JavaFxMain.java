package fr.lukam.clock.main.javafx;

import fr.lukam.clock.main.javafx.providers.JavaFxProvider;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxMain extends Application {

    private static JavaFxProvider provider;

    public static void main(String[] args) {

        buildProvider(args);
        Application.launch(JavaFxMain.class);
    }

    private static void buildProvider(String[] args) {

        if (args.length == 0) {
            provider = JavaFxProviderFactory.getProvider("basic");
            return;
        }

        provider = JavaFxProviderFactory.getProvider(args[0]);
    }

    @Override
    public void start(Stage primaryStage) {

        fr.lukam.clock.application.Application application = provider.buildApplication(primaryStage);
        application.run();

        primaryStage.show();
    }

}
