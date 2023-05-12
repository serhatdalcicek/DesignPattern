package org.example.behavorial.strategy;

public class CyrptoStrategy implements Strategy{
    @Override
    public boolean pay(double amount) {
        System.out.println("Cyrpto ile ödendi :" + amount);
        return false;
    }
}
