import java.awt.*;

class Elipsa extends Figura{
    private double a,b,F1x,F1y,F2x,F2y,c;

    public Elipsa(double a, double b, double f1x, double f1y, double f2x, double f2y, double c) {
        this.a = a;
        this.b = b;
        F1x = f1x;
        F1y = f1y;
        F2x = f2x;
        F2y = f2y;
        this.c = c;
    }

    public Elipsa(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y, double c) {
        super(pole, obwod, kolor);
        this.a = a;
        this.b = b;
        F1x = f1x;
        F1y = f1y;
        F2x = f2x;
        F2y = f2y;
        this.c = c;
    }

    public Elipsa(int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
    }

    public Elipsa() {
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getF1x() {
        return F1x;
    }

    public void setF1x(int f1x) {
        F1x = f1x;
    }

    public double getF1y() {
        return F1y;
    }

    public void setF1y(int f1y) {
        F1y = f1y;
    }

    public double getF2x() {
        return F2x;
    }

    public void setF2x(int f2x) {
        F2x = f2x;
    }

    public double getF2y() {
        return F2y;
    }

    public void setF2y(int f2y) {
        F2y = f2y;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
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

    void obliczOdlOgnisk(){
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

}
