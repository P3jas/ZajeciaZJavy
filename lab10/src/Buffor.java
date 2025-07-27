import java.util.ArrayDeque;
import java.util.Queue;

public class Buffor {
    Queue<Integer> q = new ArrayDeque<>();
    int size;

    public Buffor(int size) {
        this.size = size;
    }
    public synchronized void produkcja(int x) throws InterruptedException {
        while(q.size() == size){
            wait();
        }
        q.add(x);
        System.out.println("Produkcja: " + x);
        notifyAll();
    }
    public synchronized void konsumcja() throws InterruptedException {
        while(q.isEmpty()) {
            wait();
        }
        int x = q.remove();
        System.out.println("Konsumcja: " + x);
        notifyAll();
    }
}
