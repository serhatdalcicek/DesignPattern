package org.example.creational.factory.logging;

import org.example.creational.singleton.ILogging;

public class FileLogging implements ILogging {
    @Override
    public void log() {
        System.out.println("Dosyalara loglandı :)");
    }
}
