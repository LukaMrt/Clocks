package fr.lukam.clock.fake;

import fr.lukam.clock.domain.Presenter;

public class FakePresenter implements Presenter {

    private final FakeConsoleViewModel viewModel;

    public FakePresenter(FakeConsoleViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentTime(String time) {
        this.viewModel.text = time.split(" ");
    }

}
