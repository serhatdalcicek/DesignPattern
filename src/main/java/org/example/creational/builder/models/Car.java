package org.example.creational.builder.models;

public class Car {
    public int seats;
    public double enginePower;
    public double fuel;
    public String ModelName;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", enginePower=" + enginePower +
                ", fuel=" + fuel +
                ", ModelName='" + ModelName + '\'' +
                '}';
    }
}
