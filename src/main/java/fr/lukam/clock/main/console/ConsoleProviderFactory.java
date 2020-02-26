package fr.lukam.clock.main.console;

import fr.lukam.clock.main.console.providers.BasicProvider;
import fr.lukam.clock.main.console.providers.ConsoleProvider;

public class ConsoleProviderFactory {

    public static ConsoleProvider getProvider(String providerType) {

        switch (providerType) {

            case "basic":

            default:
                return new BasicProvider();

        }

    }

}
