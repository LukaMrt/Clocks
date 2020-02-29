package fr.lukam.clock.application.main.console;

import fr.lukam.clock.application.main.console.providers.ConsoleProvider;

public class ConsoleMain {

    private static ConsoleProvider provider;

    public static void main(String[] args) {

        buildProvider(args);
        provider.getApplication().run();

    }

    private static void buildProvider(String[] args) {

        if (args.length == 0) {
            provider = ConsoleProviderFactory.getProvider("basic");
            return;
        }

        provider = ConsoleProviderFactory.getProvider(args[0]);
    }

}
