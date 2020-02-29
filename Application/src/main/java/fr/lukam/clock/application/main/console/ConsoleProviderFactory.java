package fr.lukam.clock.application.main.console;

import fr.lukam.clock.application.main.console.providers.BasicProvider;
import fr.lukam.clock.application.main.console.providers.ConsoleProvider;

public class ConsoleProviderFactory {

    public static ConsoleProvider getProvider(String providerType) {

        switch (providerType) {

            case "basic":

            default:
                return new BasicProvider();

        }

    }

}
