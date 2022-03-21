package web;

import org.springframework.stereotype.Component;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "LADA", "Granta"));
        cars.add(new Car(2, "LADA", "Calina"));
        cars.add(new Car(3, "LADA", "Vesta"));
        cars.add(new Car(4, "LADA", "X_RAY"));
        cars.add(new Car(5, "VAZ", "21114"));

    }

    public List<Car> showCars(Integer count) {
        if (count == null||count>5||count<=0){ return cars;}


        return cars.stream().limit(count).collect(Collectors.toList());
    }
}