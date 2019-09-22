import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carCount = 0;
        int count = 0;

        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        count = sc.nextInt();

        Circuit circuit = new Circuit(carCount);
        for (int i = 0; i < count; i++)
            circuit.driveCar();

    }
}
