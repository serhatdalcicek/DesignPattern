package org.example.behavorial.chain.of.responsibilty;
//Soyutlama
public class UserService {
    private MiddleWare middleWare;

    public UserService(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }

    public void login(String email, String password){
        if(this.middleWare.check(email,password)){
            System.out.println("Giriş başarılı :)");
            return;
        }
        System.out.println("Giriş başarısız :(");
    }
}
