package org.example.structual.facade.logging;

public class Logging implements ILogging{
    @Override
    public void log() {
        System.out.println("Logged");
    }
}
