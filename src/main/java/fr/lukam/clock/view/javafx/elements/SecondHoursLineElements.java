package fr.lukam.clock.view.javafx.elements;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

import static fr.lukam.clock.utils.RectangleBuilder.aRectangle;

public class SecondHoursLineElements extends Element {

    private static final double SPACING = 85;

    private final List<Rectangle> rectangles = new ArrayList<>();

    public SecondHoursLineElements() {

        buildRectangles();

        this.getChildren().addAll(rectangles);
        this.setTranslateX(30);
        this.setTranslateY(290);
    }

    private void buildRectangles() {

        for (int i = 0; i < 4; i++) {

            Rectangle rectangle = aRectangle()
                    .withWidth(80)
                    .withHeight(20)
                    .withColor(Color.LIGHTGRAY)
                    .withX(SPACING * i)
                    .withY(0)
                    .build();

            this.rectangles.add(rectangle);
        }

    }

    @Override
    public void update(Color[] colors) {

        for (int i = 0; i < colors.length; i++) {
            Rectangle rectangle = this.rectangles.get(i);
            rectangle.setFill(colors[i]);
        }

    }

}
