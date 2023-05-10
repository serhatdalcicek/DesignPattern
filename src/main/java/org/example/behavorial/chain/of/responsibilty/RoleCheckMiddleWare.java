package org.example.behavorial.chain.of.responsibilty;

public class RoleCheckMiddleWare extends MiddleWare{

    @Override
    public boolean check(String email, String password) {
        System.out.println("RoleCheck kontrol ediliyor..");
        if(email != "admin@etiya.com" && password != "admin")
            return false;
        return checkNext(email,password);
    }
}
