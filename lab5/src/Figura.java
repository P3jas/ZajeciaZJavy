import java.awt.Color;
public class Figura {
    protected int pole, obwod;
    private Color kolor;

    protected void rysuj(){};
    protected void usun(){};
    protected void przesun(){};
    protected String podajParametr(){
        return "";
    };

    public Figura(int pole, int obwod, Color kolor) {
        this.pole = pole;
        this.obwod = obwod;
        this.kolor = kolor;
    }

    public Figura() {
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public Color getKolor() {
        return kolor;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }
}
