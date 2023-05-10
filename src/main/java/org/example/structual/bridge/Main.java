package org.example.structual.bridge;

import org.example.structual.bridge.message.senders.EmailSender;
import org.example.structual.bridge.message.senders.SmsSender;
import org.example.structual.bridge.services.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.messageSenderBase = new EmailSender();
        customerManager.verify();

        customerManager.messageSenderBase = new SmsSender();
        customerManager.verify();
    }
}
