package org.example.structual.facade.logging.authorization;

public class Authorization implements IAuthorization{
    @Override
    public void auth() {
        System.out.println("Authorization");
    }
}
