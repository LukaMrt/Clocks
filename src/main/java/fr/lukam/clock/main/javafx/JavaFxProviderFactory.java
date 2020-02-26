package fr.lukam.clock.main.javafx;

import fr.lukam.clock.main.javafx.providers.BasicProvider;
import fr.lukam.clock.main.javafx.providers.JavaFxProvider;

public class JavaFxProviderFactory {
    public static JavaFxProvider getProvider(String providerType) {

        switch (providerType) {

            case "basic":

            default:
                return new BasicProvider();

        }

    }
}
