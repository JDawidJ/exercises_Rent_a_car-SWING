import java.math.BigDecimal;

public class Auto {
    private int IDauta;
    private String nazwaAuta;
    private Specyfikacja specyfikacja;
    private int cenaAuta;
    private boolean czyDostepneAuto;
    private int naIleWypozyczone;
    private int cenaWypozyczenia;

    public Auto(int IDauta, String nazwaAuta, Specyfikacja specyfikacja, int cenaAuta, boolean czyDostepneAuto) {
        this.IDauta = IDauta;
        this.nazwaAuta = nazwaAuta;
        this.specyfikacja = specyfikacja;
        this.cenaAuta = cenaAuta;
        this.czyDostepneAuto = czyDostepneAuto;
    }

    public Auto(int IDauta, String nazwaAuta, int cenaAuta) {
        this.IDauta = IDauta;
        this.nazwaAuta = nazwaAuta;
        this.cenaAuta = cenaAuta;
    }

    @Override
    public String toString() {
        return nazwaAuta+" \n"+
                IDauta+" \n"+
                cenaAuta+" \n";
    }

    public int getIDauta() {
        return IDauta;
    }

    public void setIDauta(int IDauta) {
        this.IDauta = IDauta;
    }

    public String getNazwaAuta() {
        return nazwaAuta;
    }

    public void setNazwaAuta(String nazwaAuta) {
        this.nazwaAuta = nazwaAuta;
    }

    public Specyfikacja getSpecyfikacja() {
        return specyfikacja;
    }

    public void setSpecyfikacja(Specyfikacja specyfikacja) {
        this.specyfikacja = specyfikacja;
    }

    public int getCenaAuta() {
        return cenaAuta;
    }

    public void setCenaAuta(int cenaAuta) {
        this.cenaAuta = cenaAuta;
    }

    public boolean isCzyDostepneAuto() {
        return czyDostepneAuto;
    }

    public void setCzyDostepneAuto(boolean czyDostepneAuto) {
        this.czyDostepneAuto = czyDostepneAuto;
    }

    public int getNaIleWypozyczone() {
        return naIleWypozyczone;
    }

    public void setNaIleWypozyczone(int naIleWypozyczone) {
        this.naIleWypozyczone = naIleWypozyczone;
    }

    public int getCenaWypozyczenia() {
        return cenaWypozyczenia;
    }

    public void setCenaWypozyczenia(int cenaWypozyczenia) {
        this.cenaWypozyczenia = cenaWypozyczenia;
    }
}
