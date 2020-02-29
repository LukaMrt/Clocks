package fr.lukam.clock.view.javafx.elements;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SecondsElements extends Element {

    private final Circle circle;

    public SecondsElements() {
        this.circle = new Circle(20, 20, 40, Color.LIGHTGRAY);

        this.getChildren().add(circle);
        this.setTranslateX(177.5);
        this.setTranslateY(150);
    }

    @Override
    public void update(String[] colors) {

        Color color = Color.valueOf(colors[0]);
        circle.setFill(color);

    }

}
