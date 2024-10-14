package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String getParamCars(@RequestParam(value = "count",required = false)Integer count, Model model){
        List<Car> carList = carService.getAllCar();

        if(count!=null && count>0 && count<carList.size()){
            carList=carList.subList(0,count);
        }

        model.addAttribute("cars",carList);
        return "cars";
    }


}
