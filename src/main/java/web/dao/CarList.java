package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;


@Component
public class CarList {
    private Car[] cars = {
            new Car("Nissan", "Skyline R34", 1999),
            new Car("Nissan", "Skyline R33", 1994),
            new Car("Toyota", "Alphard", 2020),
            new Car("Honda", "Civic", 2001),
            new Car("Honda", "Accord", 2008)
    };

    private List<Car> carList = Arrays.stream(cars).toList();

    public List<Car> getCarList() {
        return carList;
    }
}
