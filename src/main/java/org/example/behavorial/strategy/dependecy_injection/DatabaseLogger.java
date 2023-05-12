package org.example.behavorial.strategy.dependecy_injection;

public class DatabaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Database Loglandı :)");
    }
}
