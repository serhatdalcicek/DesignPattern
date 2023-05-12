package org.example.behavorial.template;

public class Swim extends Game{
    @Override
    void initialize() {
        System.out.println("Swim Initialize");
    }

    @Override
    void playGame() {
        System.out.println("Swim Started ");
    }

    @Override
    void end() {
        System.out.println("Swim End ");
    }
}
