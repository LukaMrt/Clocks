package fr.lukam.clock.application.main.javafx;

import fr.lukam.clock.application.main.javafx.providers.BasicProvider;
import fr.lukam.clock.application.main.javafx.providers.JavaFxProvider;

public class JavaFxProviderFactory {

    public static JavaFxProvider getProvider(String providerType) {

        switch (providerType) {

            case "basic":

            default:
                return new BasicProvider();

        }

    }

}
