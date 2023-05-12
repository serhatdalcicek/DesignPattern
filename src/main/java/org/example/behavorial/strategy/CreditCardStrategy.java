package org.example.behavorial.strategy;

public class CreditCardStrategy implements Strategy{
    @Override
    public boolean pay(double amount) {
        System.out.println("CreditCard ile ödendi :" + amount);
        return false;
    }
}
