import java.util.Random;
public class Konsument extends Thread {
    private Buffor q;
    Konsument(Buffor q) {
        this.q = q;
    }
    Random rand = new Random();
    @Override
    public void run() {
        try {
            while (true) {
                q.konsumcja();
                Thread.sleep(rand.nextInt(1000));
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
