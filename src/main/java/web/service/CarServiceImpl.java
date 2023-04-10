package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(List<Car> carList, int count) {
        return (count >= 5) || (count == 0) ? carList : carList.stream().limit(count).toList();
    }
}
