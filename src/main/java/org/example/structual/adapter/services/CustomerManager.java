package org.example.structual.adapter.services;

import org.example.structual.adapter.XSMS;
import org.example.structual.adapter.sms.SmsSender;

public class CustomerManager implements CustomerService{
    private SmsSender smsSender;

    public CustomerManager(SmsSender smsSender){
        this.smsSender = smsSender;
    }

    @Override
    public void register() {
        System.out.println("Veritabanına kayıt edildi :)");

        XSMS xsms = new XSMS();
        xsms.sendSms("Kayıt başarılı :)","+905554553515");
    }
}
