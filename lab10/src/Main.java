import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
public class Main {
    public static void zad1() {
        Thread t1 = new Thread(new zad1());
        Thread t2 = new Thread(new zad1());
        t1.start();
        t2.start();
    }

    public static void zad2() {
        Buffor q = new Buffor(2);
        Producent p = new Producent(q);
        Konsument k = new Konsument(q);

        p.start();
        k.start();

    }
    public static void zad3() {
        LiniaProdukcyjna p = new LiniaProdukcyjna();
        Smazenie s = new Smazenie(p);
        Smarowanie sm = new Smarowanie(p);
        Zawijanie z = new Zawijanie(p);

        s.start();
        sm.start();
        z.start();
    }
    public static void main(String[] args) {
        zad3();

    }
}