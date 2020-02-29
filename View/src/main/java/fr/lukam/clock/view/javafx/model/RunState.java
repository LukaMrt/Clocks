package fr.lukam.clock.view.javafx.model;

public class RunState {

    private boolean running = true;

    public void changeState() {
        this.running = !this.running;
    }

    public boolean isRunning() {
        return this.running;
    }

}
