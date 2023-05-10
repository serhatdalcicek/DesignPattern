package org.example.structual.decorator;

import org.example.structual.decorator.decorators.ShapeColorDecorator;
import org.example.structual.decorator.models.Circle;
import org.example.structual.decorator.models.Rectangle;
import org.example.structual.decorator.models.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape decoractorRectangle = new ShapeColorDecorator(new Rectangle());
        decoractorRectangle.draw();
    }
}
