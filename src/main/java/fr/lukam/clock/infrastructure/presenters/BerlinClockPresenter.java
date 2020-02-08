package fr.lukam.clock.infrastructure.presenters;

import fr.lukam.clock.infrastructure.ViewModel;

public class BerlinClockPresenter implements ClockPresenter {

    private final ViewModel viewModel;

    public BerlinClockPresenter(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentTime(String time) {

        String[] timeArray = time.split(" ");

        viewModel.text = timeArray;

    }

}
