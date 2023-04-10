package web.model;

import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;

public class CarList {
    private Car[] cars = {
            new Car("Nissan", "Skyline R34", 1999),
            new Car("Nissan", "Skyline R33", 1994),
            new Car("Toyota", "Alphard", 2020),
            new Car("Honda", "Civic", 2001),
            new Car("Honda", "Accord", 2008)
    };
    private CarService carService = new CarServiceImpl();

    public List<Car> getCars(int count) {
        return carService.getCarList(Arrays.stream(cars).toList(), count);
    }
}
