import java.awt.*;

public class Trojkat extends Wielokat{
    private int h,a;

    public Trojkat(int pole, int obwod, Color kolor, int lWierzcholkow, int lBokow, int suma, int h, int a) {
        super(pole, obwod, kolor, lWierzcholkow, lBokow, suma);
        this.h = h;
        this.a = a;
    }

    public Trojkat(int lWierzcholkow, int lBokow, int suma, int h, int a) {
        super(lWierzcholkow, lBokow, suma);
        this.h = h;
        this.a = a;
    }

    public Trojkat(int h, int a) {
        this.h = h;
        this.a = a;
    }

    public Trojkat(int pole, int obwod, Color kolor, int h, int a) {
        super(pole, obwod, kolor);
        this.h = h;
        this.a = a;
    }

    public Trojkat(int pole, int obwod, Color kolor, int lWierzcholkow, int lBokow, int suma) {
        super(pole, obwod, kolor, lWierzcholkow, lBokow, suma);
    }

    public Trojkat(int lWierzcholkow, int lBokow, int suma) {
        super(lWierzcholkow, lBokow, suma);
    }

    public Trojkat() {
    }

    public Trojkat(int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
