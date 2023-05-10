package org.example.structual.adapter;

import org.example.structual.adapter.adapters.YSMSAdapter;
import org.example.structual.adapter.services.CustomerManager;
import org.example.structual.adapter.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new YSMSAdapter());
        customerService.register();
    }
}
