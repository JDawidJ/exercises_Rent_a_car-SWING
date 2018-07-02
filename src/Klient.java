import java.util.ArrayList;
import java.util.List;

public class Klient {
    private int IDklienta;
    private String imie;
    private String password;
    private Auto wypozyczoneAuto;
public Klient(){}
    public Klient(int IDklienta, String imie, String password) {
        this.IDklienta = IDklienta;
        this.imie = imie;
        this.password = password;
        Garaz.getListaKlientow().add(this);

    }

    public int getIDklienta() {
        return IDklienta;
    }

    public void setIDklienta(int IDklienta) {
        this.IDklienta = IDklienta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auto getWypozyczoneAuto() {
        return wypozyczoneAuto;
    }

    public void setWypozyczoneAuto(Auto wypozyczoneAuto) {
        this.wypozyczoneAuto = wypozyczoneAuto;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "IDklienta=" + IDklienta +
                ", imie='" + imie + '\'' +
                ", password='" + password + '\'' +
                ", wypozyczoneAuto=" + wypozyczoneAuto +
                '}';
    }
}
