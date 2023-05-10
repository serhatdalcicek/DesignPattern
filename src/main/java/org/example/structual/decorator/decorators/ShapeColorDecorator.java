package org.example.structual.decorator.decorators;

import org.example.structual.decorator.models.Shape;

public class ShapeColorDecorator extends ShapeDecorator {

    public ShapeColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Shape'in rengi değiştirildi :)");
        super.draw();
    }

}
