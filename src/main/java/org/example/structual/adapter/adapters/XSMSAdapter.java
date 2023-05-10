package org.example.structual.adapter.adapters;

import org.example.structual.adapter.XSMS;
import org.example.structual.adapter.sms.SmsSender;

public class XSMSAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        XSMS xsms = new XSMS();
        xsms.sendSms(message, to);
    }
}
