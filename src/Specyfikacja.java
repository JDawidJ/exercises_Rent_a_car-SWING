public class Specyfikacja {
    private String marka;
    private String silnik;
    private String model;
    private String kolor;

    public Specyfikacja(String marka, String silnik, String model, String kolor) {
        this.marka = marka;
        this.silnik = silnik;
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Marka: "+marka+", Silnik: "+silnik+", Kolor: "+kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
