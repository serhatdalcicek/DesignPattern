package org.example.behavorial.visitor;

public class Computer implements ComputerPart{

    ComputerPart[] computerParts;

    public Computer(){
        this.computerParts = new ComputerPart[]{new Keyboard(),new Monitor(),new Mouse()};
    }

    public Computer(ComputerPart[] computerParts) {
        this.computerParts = computerParts;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part:computerParts){
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
