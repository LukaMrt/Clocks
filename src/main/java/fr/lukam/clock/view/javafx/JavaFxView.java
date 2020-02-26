package fr.lukam.clock.view.javafx;

import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import fr.lukam.clock.view.View;
import fr.lukam.clock.view.javafx.elements.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxView implements View {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Berlin clock";

    private final Element[] elements = new Element[]{
            new SecondsElements(),
            new FirstHoursLineElements(),
            new SecondHoursLineElements(),
            new FirstMinutesLineElement(),
            new SecondsMinutesLineElement()
    };

    private final JavaFxViewModel viewModel;
    private final Stage primaryStage;

    public JavaFxView(JavaFxViewModel viewModel, Stage primaryStage)  {
        this.viewModel = viewModel;
        this.primaryStage = primaryStage;

        setupStage(primaryStage);
    }

    private void setupStage(Stage primaryStage) {

        Group group = new Group(elements);
        Scene scene = new Scene(group, WIDTH, HEIGHT);

        primaryStage.setTitle(TITLE);
        primaryStage.setScene(scene);
    }

    @Override
    public void display() {

        for (int i = 0; i < this.elements.length; i++) {

            Color[] colorsLine = this.viewModel.colors[i];
            this.elements[i].update(colorsLine);

        }

    }

    @Override
    public boolean isRunning() {
        return this.primaryStage.isShowing();
    }

}
