package org.example.behavorial.strategy.dependecy_injection;

public class Main {
    public static void main(String[] args) {
        //IoC container
        CustomerService customerService = new CustomerManager(new FileLogger());
        customerService.save();
    }
}
