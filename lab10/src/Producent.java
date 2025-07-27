import java.util.Queue;
import java.util.Random;

public class Producent extends Thread {
    private Buffor q;
    Random rand = new Random();
    public Producent(Buffor q) {
        this.q = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                q.produkcja(rand.nextInt(100));
                Thread.sleep(rand.nextInt(100));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
