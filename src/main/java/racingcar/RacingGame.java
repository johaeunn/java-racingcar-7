package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int round;
    private Cars cars;

    public RacingGame(Cars cars, int round) {
        this.round = round;
        this.cars = cars;
    }

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

    public void startingGame() {
        for (int i = 0; i < round; i++) {
            moveCars(cars);
        }
    }

    private void moveCars(Cars cars) {
        for(Car car : cars.getCars()) {
            car.move();
            printResult(car);
        }
    }

    private void printResult(Car car) {
        int location = car.getLocation();
        String dash = "-";
        System.out.println(car.getName() + " : " + dash.repeat(location));
    }
}
