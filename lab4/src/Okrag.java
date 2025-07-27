import java.util.Random;

public class Okrag {
    int x,y,r;


    public Okrag() {
        Random r = new Random();

        this.x = r.nextInt(95 - 5 + 1) + 5;
        this.y = r.nextInt(95 - 5 + 1) + 5;
        this.r = r.nextInt(5 - 1 + 1) + 1;;
    }

    public Okrag(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
