package fr.lukam.clock.application.main.javafx;

import fr.lukam.clock.application.main.javafx.providers.JavaFxProvider;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxMain extends Application {

    private static JavaFxProvider provider;

    @Override
    public void start(Stage primaryStage) {

        buildProvider(new String[]{});

        fr.lukam.clock.application.Application application = provider.buildApplication(primaryStage);
        application.run();

        primaryStage.show();
    }

    private static void buildProvider(String[] args) {

        if (args.length == 0) {
            provider = JavaFxProviderFactory.getProvider("basic");
            return;
        }

        provider = JavaFxProviderFactory.getProvider(args[0]);
    }

}
