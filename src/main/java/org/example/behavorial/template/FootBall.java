package org.example.behavorial.template;

public class FootBall extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialazed");
    }

    @Override
    void playGame() {
        System.out.println("Football started");
    }

    @Override
    void end() {
        System.out.println("Football end");
    }
}
