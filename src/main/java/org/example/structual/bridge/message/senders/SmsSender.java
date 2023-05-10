package org.example.structual.bridge.message.senders;

public class SmsSender extends MessageSenderBase{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS İle Yollandı : " +  message);
    }
}
