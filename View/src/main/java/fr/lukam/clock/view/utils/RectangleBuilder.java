package fr.lukam.clock.view.utils;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleBuilder {

    private int width;
    private int height;
    private Color color;
    private double x;
    private double y;

    private RectangleBuilder() {
    }

    public static RectangleBuilder aRectangle() {
        return new RectangleBuilder();
    }

    public RectangleBuilder withWidth(int width) {
        this.width = width;
        return this;
    }

    public RectangleBuilder withHeight(int height) {
        this.height = height;
        return this;
    }

    public RectangleBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public RectangleBuilder withX(double x) {
        this.x = x;
        return this;
    }

    public RectangleBuilder withY(double y) {
        this.y = y;
        return this;
    }

    public Rectangle build() {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(this.width);
        rectangle.setHeight(this.height);
        rectangle.setFill(this.color);
        rectangle.setX(this.x);
        rectangle.setY(this.y);

        return rectangle;
    }

}
