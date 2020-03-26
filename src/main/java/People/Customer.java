package People;

import Cars.Car;

import java.util.ArrayList;

public class Customer extends Person {

    public Customer(String name, int totalCash, ArrayList<Car> cars){
        super(name, totalCash, cars);
    }
}
