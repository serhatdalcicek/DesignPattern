package org.example.behavorial.visitor;

public class ComputerPartGamerVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Gaming Bilgisayar Üretildi");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Gaming Monitor Üretildi");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Gaming Mouse Üretildi");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Gaming Klavye Üretildi");

    }
}
