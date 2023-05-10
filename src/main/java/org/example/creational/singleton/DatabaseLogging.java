package org.example.creational.singleton;

public class DatabaseLogging implements ILogging{
    private static DatabaseLogging instance;
    private String message;

    public DatabaseLogging(String message) {
        this.message = message;
    }

    @Override
    public void log() {
        System.out.println(message);
    }

    public static DatabaseLogging getInstance(String message) {
        DatabaseLogging logging = instance;
        if (logging != null)
            return logging;


        synchronized (DatabaseLogging.class) {
            if (instance == null)
                instance = new DatabaseLogging(message);
            return instance;
        }
    }
}
