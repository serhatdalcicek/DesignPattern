package org.example.behavorial.chain.of.responsibilty;

public class Main {
    public static void main(String[] args) {
        MiddleWare chain = MiddleWare.link(
                new ThrottleMiddleWare(2),
                new UserExistsMiddleWare(),
                new RoleCheckMiddleWare()
        );

        UserService userService = new UserService(chain);
        userService.login("etiya1@etiya.com","12345");
        userService.login("etiya@etiya.com","admin");
        userService.login("etiya@etiya.com","admin");
    }
}
