package org.example.behavorial.template;

public class Golf extends Game{
    @Override
    void initialize() {
        System.out.println("Golf initialazed");
    }

    @Override
    void playGame() {
        System.out.println("Golf started");
    }

    @Override
    void end() {
        System.out.println("Golf end");
    }
}
