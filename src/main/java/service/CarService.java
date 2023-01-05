package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarService {

    public List<Car> cars() {
        final List<Car> car = new ArrayList<>();
        car.add(new Car("Audi", "Red", 1));
        car.add(new Car("Opel", "White", 2));
        car.add(new Car("BMW", "Dark", 3));
        car.add(new Car("Lada", "Yellow", 4));
        car.add(new Car("Kia", "Blue", 5));
        return car;
    }

    public List<Car> getCars(Integer count) {
        return cars().stream().limit(count).collect(Collectors.toList());
    }
}
