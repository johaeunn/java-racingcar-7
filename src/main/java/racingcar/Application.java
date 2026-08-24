package racingcar;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputNames = scanner.nextLine();
        List<String> names = List.of(inputNames.split(","));
        Cars cars = new Cars(names);

        System.out.println("시도할 회수는 몇회인가요?");
        int round = scanner.nextInt();

        RacingGame racingGame = new RacingGame(cars, round);
        racingGame.startingGame();


    }
}
