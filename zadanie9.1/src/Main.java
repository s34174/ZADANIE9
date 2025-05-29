import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Corolla", 2010));
        cars.add(new Car("Audi A4", 2015));
        cars.add(new Car("BMW X5", 2008));
        cars.add(new Car("Ford Focus", 2012));
        cars.add(new Car("Mazda 3", 2011));
        cars.add(new Car("Opel Astra", 2009));
        cars.add(new Car("Honda Civic", 2016));
        cars.add(new Car("Kia Rio", 2013));
        cars.add(new Car("Tesla Model 3", 2020));
        cars.add(new Car("Fiat Panda", 2005));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return model + " - " + year;
    }
}