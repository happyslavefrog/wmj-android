import java.util.Random;

public class Circuit {
    private int carCount;

    public Circuit(int carCount) {
        this.carCount = carCount;
    }

    public void driveCar() {
        Random rand = new Random();

        for (int i = 0; i < carCount; i++) {
            if (rand.nextInt(9) > 4) {
                System.out.printf("%d번 자동차 전진\n", i + 1);
                continue;
            }
            System.out.printf("%d번 자동차 멈춤\n", i + 1);
        }
    }

}
