package org.example.behavorial.strategy.dependecy_injection;

public class CustomerManager implements CustomerService{
    private Logger logger;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void save() {
        //logger
        //DatabaseLogger logger = new DatabaseLogger();
        logger.log();
        System.out.println("Customer Saved ");
    }
}
