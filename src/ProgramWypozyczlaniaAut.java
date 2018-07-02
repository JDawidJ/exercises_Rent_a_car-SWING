import javax.swing.*;

public class ProgramWypozyczlaniaAut extends JFrame {


    ProgramWypozyczlaniaAut(Klient klientProg) {
      setSize(600,300);
        setTitle("Wypozyczalnia");
        setLocationRelativeTo(null);
        add(new GUITło(klientProg));
        pack();
        setDefaultCloseOperation(3);
        setVisible(false);


    }

    public static void main(String[] args) {
        new Garaz();
        UserMethods.wypozycz(Garaz.getListaKlientow().get(0), Garaz.getListaDostepnychAut().get(0), 8);
        new ProgramWypozyczlaniaAut(UserMethods.wezKlienta());
        new GUILogowanie();


        System.out.println(Garaz.getListaDostepnychAut());
        System.out.println(UserMethods.wezKlienta());
    }


}
