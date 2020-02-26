package fr.lukam.clock.view;

import fr.lukam.clock.infrastructure.model.ConsoleViewModel;

public class ConsoleView implements View {

    private final ConsoleViewModel viewModel;

    public ConsoleView(ConsoleViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void display() {

        for (String clockLine : this.viewModel.text) {
            System.out.println(clockLine);
        }

    }

    @Override
    public boolean isRunning() {
        return true;
    }

}
