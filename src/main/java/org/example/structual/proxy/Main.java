package org.example.structual.proxy;

import org.example.structual.proxy.proxies.ExampleServiceProxy;
import org.example.structual.proxy.services.ExampleManager;
import org.example.structual.proxy.services.ExampleService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleServiceProxy(new ExampleManager());
        System.out.println("1.Method Çağırıldı " + LocalDateTime.now());
        System.out.println(exampleService.getData(5));
        System.out.println("Cevap Döndü " + LocalDateTime.now());

        System.out.println("2.Method Çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(6));
        System.out.println("Cevap Döndü" + LocalDateTime.now());

        System.out.println("3.Method Çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(4));
        System.out.println("Cevap Döndü" + LocalDateTime.now());

        System.out.println("4.Method Çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(5));
        System.out.println("Cevap Döndü" + LocalDateTime.now());
    }
}
