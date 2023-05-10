package org.example.creational.builder.builders;

import org.example.creational.builder.models.Car;

public class CarBuilder implements ICarBuilder{
    private Car car = new Car();

    @Override
    public void setSeats(int seats) {
        if (seats > 4)
            seats = 4;
         this.car.seats = seats;
    }

    @Override
    public void setFuel(double fuel) {
        this.car.fuel = fuel;
    }

    @Override
    public void setEnginePower(double enginePower) {
        this.car.enginePower = enginePower;
    }

    @Override
    public void setModelName(String modelName) {
        this.car.ModelName = modelName;
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
