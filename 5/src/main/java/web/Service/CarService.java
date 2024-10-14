package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> getAllCar(){
        List<Car> carlist = new ArrayList<>();
        carlist.add(new Car("BMV",200,3000000));
        carlist.add(new Car("Toyota",80,2500000));
        carlist.add(new Car("Ford",120,2800000));
        carlist.add(new Car("Honda",150,2900000));
        carlist.add(new Car("Tesla",220,3500000));
        return carlist;
    }
}
