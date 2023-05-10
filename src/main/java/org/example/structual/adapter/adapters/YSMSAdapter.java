package org.example.structual.adapter.adapters;

import org.example.structual.adapter.YSMS;
import org.example.structual.adapter.sms.SmsSender;

public class YSMSAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        YSMS ysms = new YSMS();
        ysms.send(to,message);
    }
}
