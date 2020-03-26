package People;

import Cars.Car;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private int totalCash;
    private ArrayList<Car> cars;

    public Person(String name, int totalCash, ArrayList<Car> cars){
        this.name = name;
        this.totalCash = totalCash;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
