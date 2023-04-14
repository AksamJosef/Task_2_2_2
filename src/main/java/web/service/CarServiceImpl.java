package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarList;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {


    @Autowired
    CarList carList;


    @Override
    public List<Car> getCarList(Integer count) {
        if ((count == null) || (count < 0)) count = 0;
        return (count >= 5) || (count == 0)
                ? carList.getCarList()
                : carList.getCarList().stream().limit(count).toList();
    }
}
