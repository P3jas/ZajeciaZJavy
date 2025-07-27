import java.awt.*;

public class Okrag extends Elipsa{
    private int r;

    public Okrag(double a, double b, double f1x, double f1y, double f2x, double f2y, double c, int r) {
        super(a, b, f1x, f1y, f2x, f2y, c);
        this.r = r;
    }

    public Okrag(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y, double c, int r) {
        super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y, c);
        this.r = r;
    }

    public Okrag(int pole, int obwod, Color kolor, int r) {
        super(pole, obwod, kolor);
        this.r = r;
    }

    public Okrag(int r) {
        this.r = r;
    }

    public Okrag(double a, double b, double f1x, double f1y, double f2x, double f2y, double c) {
        super(a, b, f1x, f1y, f2x, f2y, c);
    }

    public Okrag(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y, double c) {
        super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y, c);
    }

    public Okrag(int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
    }

    public Okrag() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    protected void rysuj() {
        super.rysuj();
    }

    @Override
    protected void usun() {
        super.usun();
    }

    @Override
    protected void przesun() {
        super.przesun();
    }

    @Override
    protected String podajParametr() {
        return super.podajParametr();
    }
}
