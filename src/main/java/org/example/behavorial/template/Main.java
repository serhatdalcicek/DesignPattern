package org.example.behavorial.template;

public class Main {
    public static void main(String[] args) {
        Game game = new FootBall();
        Game game1 = new Golf();
        Game game2 = new BasketBall();
        Game game3 = new Swim();

        game.play();
        game1.play();
        game2.play();
        game3.play();
    }
}
