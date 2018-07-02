import java.util.ArrayList;
import java.util.List;

public class Garaz {
    private static List<Auto>listaWszystkichAut=new ArrayList<>();
    private static List<Auto>listaWypozyczonychAut=new ArrayList<>();
    private static List<Auto>listaDostepnychAut=new ArrayList<>();
    private static List<Klient>listaKlientow=new ArrayList<>();

    public Garaz() {


        Klient k1=new Klient(01,"Dawid","1234");
        Klient k2=new Klient(02,"Maja","1234");
        Klient k3=new Klient(03,"Ania","1234");
        Klient k4=new Klient(04,"Hania","1234");

        Auto a1=new Auto(001,"Skoda",new Specyfikacja("Skoda","diesel","Superb","Biały"),300,true);
        Auto a2=new Auto(002,"Audi",new Specyfikacja("Audi","diesel","A6","Czarny"),400,true);
        Auto a3=new Auto(003,"Mercedes",new Specyfikacja("Mercedes","benzyna","CLA","Czerwony"),600,true);
        Auto a4=new Auto(004,"Renault",new Specyfikacja("Fiat","diesel","Capture","Szary"),250,true);
        Auto a5=new Auto(005,"Fiat",new Specyfikacja("Kia","benzyna","Rio","Biały"),200,true);

        Garaz.getListaWszystkichAut().add(a1);
        Garaz.getListaWszystkichAut().add(a2);
        Garaz.getListaWszystkichAut().add(a3);
        Garaz.getListaWszystkichAut().add(a4);
        Garaz.getListaWszystkichAut().add(a5);

        Garaz.getListaDostepnychAut().add(a1);
        Garaz.getListaDostepnychAut().add(a2);
        Garaz.getListaDostepnychAut().add(a3);
        Garaz.getListaDostepnychAut().add(a4);
        Garaz.getListaDostepnychAut().add(a5);

    }

    public static List<Auto> getListaWszystkichAut() {
        return listaWszystkichAut;
    }

    public static void setListaWszystkichAut(List<Auto> listaWszystkichAut) {
        Garaz.listaWszystkichAut = listaWszystkichAut;
    }

    public static List<Auto> getListaWypozyczonychAut() {
        return listaWypozyczonychAut;
    }

    public static void setListaWypozyczonychAut(List<Auto> listaWypozyczonychAut) {
        Garaz.listaWypozyczonychAut = listaWypozyczonychAut;
    }

    public static List<Auto> getListaDostepnychAut() {
        return listaDostepnychAut;
    }

    public static void setListaDostepnychAut(List<Auto> listaDostepnychAut) {
        Garaz.listaDostepnychAut = listaDostepnychAut;
    }

    public static List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public static void setListaKlientow(List<Klient> listaKlientow) {
        Garaz.listaKlientow = listaKlientow;
    }
}
