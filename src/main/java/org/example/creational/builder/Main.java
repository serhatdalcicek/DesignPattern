package org.example.creational.builder;

import org.example.creational.builder.builders.CarBuilder;
import org.example.creational.builder.builders.ICarBuilder;
import org.example.creational.builder.directors.CarDirector;
import org.example.creational.builder.models.Car;

public class Main {
    public static void main(String[] args) {
            ICarBuilder carBuilder = new CarBuilder();
            carBuilder.setModelName("GTR");
            carBuilder.setSeats(2);
            carBuilder.setEnginePower(600);
            carBuilder.setFuel(200);

            Car car = carBuilder.getCar();
            System.out.println(car.toString());

            CarDirector carDirector = new CarDirector();
            Car sportCar = carDirector
                    .constructSportCar(new CarBuilder());
            Car raceCar = carDirector
                    .constructRaceCar(new CarBuilder());

            System.out.println(sportCar.toString());
            System.out.println(raceCar.toString());

    }
}
