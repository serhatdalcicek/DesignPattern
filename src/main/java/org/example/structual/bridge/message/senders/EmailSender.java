package org.example.structual.bridge.message.senders;

public class EmailSender extends MessageSenderBase{
    @Override
    public void sendMessage(String message) {
        System.out.println("Mail İle Yollandı : " + message);
    }
}
