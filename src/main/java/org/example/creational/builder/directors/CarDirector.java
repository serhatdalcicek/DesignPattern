package org.example.creational.builder.directors;

import org.example.creational.builder.builders.ICarBuilder;
import org.example.creational.builder.models.Car;

public class CarDirector {
        public Car constructSportCar(ICarBuilder carBuilder){
            carBuilder.setEnginePower(200);
            carBuilder.setModelName("SUPRA");
            carBuilder.setFuel(200);
            carBuilder.setSeats(4);
            return carBuilder.getCar();
        }

        public Car constructRaceCar(ICarBuilder carBuilder){
            carBuilder.setEnginePower(600);
            carBuilder.setModelName("GTR-R34");
            carBuilder.setFuel(400);
            carBuilder.setSeats(2);
            return  carBuilder.getCar();
        }
}
