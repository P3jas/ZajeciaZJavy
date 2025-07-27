public class Owoc {
    String nazwa;
    double masa;
    String krajPochodzenia;
    public Owoc() {
    }
    public Owoc(String nazwa, String krajPochodzenia) {
        this.nazwa = nazwa;
        this.krajPochodzenia = krajPochodzenia;
    }
    public void podajMase(double masaZmierzona) {
        masa = masaZmierzona;
    }

    public double getMasa() {
        return masa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
