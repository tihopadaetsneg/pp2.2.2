package web.services;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServicesImpl implements CarServices{
    @Override
    public List<Car> getCars(int amountOfCars) {
        List <Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedes", 2007, 150000));
        carList.add(new Car("BMW", 2022, 10000));
        carList.add(new Car("Audi", 2014, 100000));
        carList.add(new Car("UAZ", 1999, 250000));
        carList.add(new Car("Lada", 2010, 200000 ));
        return carList.stream().limit(amountOfCars).toList();
    }
}
