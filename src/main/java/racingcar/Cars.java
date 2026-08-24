package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        for (String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
