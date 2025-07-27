import java.util.Random;
public class zad1 implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + ". ID: " + Thread.currentThread().getId() + " wylosowana liczba: " + random.nextInt(100) + "");
        }
    }
}
