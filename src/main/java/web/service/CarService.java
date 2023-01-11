package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("Audi", "Red", 1));
        car.add(new Car("Opel", "White", 2));
        car.add(new Car("BMW", "Dark", 3));
        car.add(new Car("Lada", "Yellow", 4));
        car.add(new Car("Kia", "Blue", 5));
    }

    public List<Car> getCars(Integer count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
