package fr.lukam.clock.fake.architecture.presenters;

import fr.lukam.clock.infrastructure.model.ConsoleViewModel;
import fr.lukam.clock.infrastructure.presenters.Presenter;

public class FakePresenter implements Presenter {

    private final ConsoleViewModel viewModel;

    public FakePresenter(ConsoleViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentTime(String time) {
        this.viewModel.text = time.split(" ");
    }

}
