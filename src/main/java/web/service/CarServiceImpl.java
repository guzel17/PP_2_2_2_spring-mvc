package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Volvo", "V8", 2020));
        cars.add(new Car("Honda", "H10", 2018));
        cars.add(new Car("Renault", "R9", 2019));
        cars.add(new Car("Toyota", "T7", 2020));
        cars.add(new Car("Ford", "F8", 2016));
    }

    public List<Car> getList(int count) {
        return cars.stream().limit(count).toList();
    }
}
