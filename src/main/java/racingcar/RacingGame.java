package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    List<String> names;
    Cars cars = new Cars(names);

    private int calculateMaxLocation() {
        int max = 0;
        for (Car car: cars.getCars()) {
            if (car.getLocation() > max ){
                max = car.getLocation();
            }
        }
        return max;
    }

    public List<Car> pickWinner() {
        int max = calculateMaxLocation();
        List<Car> winnerList = new ArrayList<>();
        for (Car car: cars.getCars()) {
            if (car.getLocation() == max) {
                winnerList.add(car);
            }
        }
        return winnerList;
    }
}
