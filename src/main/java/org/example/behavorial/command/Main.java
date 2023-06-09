package org.example.behavorial.command;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.name = "BTC";

        SellCoinCommand sellCoinCommand = new SellCoinCommand(coin);
        BuyCoinCommand buyCoinCommand = new BuyCoinCommand(coin);

        Broker broker = new Broker();
        broker.addCommentToQuery(sellCoinCommand);
        broker.addCommentToQuery(buyCoinCommand);

        broker.executeAll();
    }
}
