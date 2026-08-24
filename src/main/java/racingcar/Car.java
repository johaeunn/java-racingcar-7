package racingcar;

import java.util.Random;

public class Car {
    private final static int MOVE_THRESHOLD = 4;
    private String name;
    private int location;

    public Car(String name) {
        this.name = name;
        location = 0;
    }

    public void move() {
        int number = randomGenerator();
        if ( number >= MOVE_THRESHOLD ) {
            location++;
        }
    }

    private int randomGenerator() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int getLocation() {
        return location;
    }
}
