package org.example.behavorial.chain.of.responsibilty;

public class ThrottleMiddleWare extends MiddleWare{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottleMiddleWare(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        System.out.println("Throttle kontrol ediliyor..");
        if(System.currentTimeMillis() > currentTime + 60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if(request > requestPerMinute){
            System.out.println("Request sayısı aşıldı");
            Thread.currentThread().stop();
            //return false;dsaads
        }
        return checkNext(email,password);
    }
}
