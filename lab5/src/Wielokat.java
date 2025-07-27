import java.awt.*;

class Wielokat extends Figura{
    private int lWierzcholkow,lBokow,suma;

    public Wielokat(int pole, int obwod, Color kolor, int lWierzcholkow, int lBokow, int suma) {
        super(pole, obwod, kolor);
        this.lWierzcholkow = lWierzcholkow;
        this.lBokow = lBokow;
        this.suma = suma;
    }
    public Wielokat(int lWierzcholkow, int lBokow, int suma) {
        this.lWierzcholkow = lWierzcholkow;
        this.lBokow = lBokow;
        this.suma = suma;
    }

    public Wielokat() {
    }
    public Wielokat(int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
    }

    public int getlWierzcholkow() {
        return lWierzcholkow;
    }

    public void setlWierzcholkow(int lWierzcholkow) {
        this.lWierzcholkow = lWierzcholkow;
    }

    public int getlBokow() {
        return lBokow;
    }

    public void setlBokow(int lBokow) {
        this.lBokow = lBokow;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    protected void rysuj() {
        super.rysuj();
        System.out.println("Trwa rysowanie wielokąta o elipsy");
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
    void obliczSuma(){
        suma = (lBokow - 2) * 180;
    }
}
