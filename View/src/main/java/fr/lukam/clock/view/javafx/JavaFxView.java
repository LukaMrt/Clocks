package fr.lukam.clock.view.javafx;

import fr.lukam.clock.infrastructure.model.JavaFxViewModel;
import fr.lukam.clock.infrastructure.View;
import fr.lukam.clock.view.javafx.elements.*;
import fr.lukam.clock.view.javafx.model.RunState;
import javafx.scene.Group;
import javafx.scene.Scene;
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

    public JavaFxView(JavaFxViewModel viewModel, Stage primaryStage, RunState runState)  {
        this.viewModel = viewModel;

        primaryStage.setOnCloseRequest(event -> runState.changeState());

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

            String[] colorsLine = this.viewModel.colors[i];
            this.elements[i].update(colorsLine);

        }

    }

}
