package org.example.behavorial.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new CashStrategy());
        System.out.println(context.executePayment(500));

        context.strategy = new CyrptoStrategy();
        System.out.println(context.executePayment(500));

        context.strategy = new CreditCardStrategy();
        System.out.println(context.executePayment(600));
    }
}
