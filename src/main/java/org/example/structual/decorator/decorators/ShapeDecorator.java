package org.example.structual.decorator.decorators;

import org.example.structual.decorator.models.Shape;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

}
