package org.example.behavorial.visitor;

public class ConcreateComputerPartVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Klasik Bilgisayar Üretildi");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Klasik Monitor Üretildi");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Klasik Mouse Üretildi");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Klasik Klavye Üretildi");

    }
}
