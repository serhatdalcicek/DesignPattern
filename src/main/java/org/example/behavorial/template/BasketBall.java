package org.example.behavorial.template;

public class BasketBall extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball initialize");
    }

    @Override
    void playGame() {
        System.out.println("Basketball started");
    }

    @Override
    void end() {
        System.out.println("Basketball end");
    }
}
