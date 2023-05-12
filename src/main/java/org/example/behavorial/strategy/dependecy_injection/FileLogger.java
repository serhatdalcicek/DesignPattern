package org.example.behavorial.strategy.dependecy_injection;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("File Loglandı ");
    }
}
