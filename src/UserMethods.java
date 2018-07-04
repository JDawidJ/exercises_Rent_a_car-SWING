import java.util.List;

public class UserMethods {

    public static void wypozycz(Klient klient,Auto auto,int naIleWypozyczone){
        Garaz.getListaDostepnychAut().remove(auto);
        Garaz.getListaWypozyczonychAut().add(auto);

        klient.setWypozyczoneAuto(auto);
        auto.setCenaWypozyczenia(naIleWypozyczone*auto.getCenaAuta());
        auto.setCzyDostepneAuto(false);
    }
    public static void zwrocAuto(Klient klient){
        stworzFakture(klient);
        Garaz.getListaDostepnychAut().add(klient.getWypozyczoneAuto());
        Garaz.getListaWypozyczonychAut().remove(klient.getWypozyczoneAuto());


        klient.getWypozyczoneAuto().setCenaWypozyczenia(0);
        klient.setWypozyczoneAuto(null);
        klient.getWypozyczoneAuto().setCzyDostepneAuto(true);
    }

    public static String stworzFakture(Klient klient){
        if(klient.getWypozyczoneAuto()==null){
            System.out.println("Zadne  auto nie jest wypozyczone");
            return "Zadne  auto nie jest wypozyczone";

        }
        else
        System.out.println(klient.getWypozyczoneAuto().getCenaWypozyczenia());
        return String.valueOf(klient.getWypozyczoneAuto().getCenaWypozyczenia());

    }

    public static Klient stworzKlienta(){
        return new Klient();
    }

    public static Klient wezKlienta(){
        return Garaz.getListaKlientow().get(0);
    }

public static void dodajAuto(int idAuta,String nazwaAuta,int cenaAuta){
        Garaz.getListaWszystkichAut().add(new Auto(idAuta,nazwaAuta,cenaAuta));
        Garaz.getListaDostepnychAut().add(new Auto(idAuta,nazwaAuta,cenaAuta));

}



}
