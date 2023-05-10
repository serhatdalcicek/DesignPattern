package org.example.structual.bridge.services;

import org.example.structual.bridge.message.senders.MessageSenderBase;

public class CustomerManager implements CustomerService{
    public MessageSenderBase messageSenderBase;

    @Override
    public void verify() {
        messageSenderBase.sendMessage("Doğrulama Linki : ");
    }
}
