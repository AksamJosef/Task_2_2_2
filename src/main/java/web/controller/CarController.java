package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarList;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    private CarList cars = new CarList();



    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {
        if (count == null) count = 0;
        List<Car> carList = cars.getCars(count);


//        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC application");
//        messages.add("5.2.0 version by sep'19 ");
////        model.addAttribute("messages", messages);

        model.addAttribute("carList", carList);
        return "cars";
    }
}