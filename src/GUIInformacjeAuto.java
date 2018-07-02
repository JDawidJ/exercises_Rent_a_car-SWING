import javax.swing.*;
import java.awt.*;

public class GUIInformacjeAuto extends JPanel {

    public static JButton wypożycz = new JButton("wypożycz");
    public static JLabel infoAutoCzyDostepne = new JLabel("CZY DOSTEPNE: ");
    public static JLabel infoAutoMarka = new JLabel("Marka");

    public static JLabel infoAutoSilnik = new JLabel("Silnik");
    public static JLabel infoAutoKolor = new JLabel("Kolor");

/*    public static JLabel IDauta=new JLabel("IDauta");
    public static JLabel IDklienta=new JLabel("IDklienta");*/

    GUIInformacjeAuto() {


        setSize(300, 200);
        Font czcionka = new Font("font", Font.BOLD, 18);
        setLayout(new BorderLayout());
        infoAutoMarka.setFont(czcionka);
        infoAutoSilnik.setFont(czcionka);
        infoAutoKolor.setFont(czcionka);
        infoAutoCzyDostepne.setFont(czcionka);
        // infoAutoCzyDostepne.setForeground(Color.blue);


        add(infoAutoMarka, BorderLayout.NORTH);
        add(infoAutoSilnik, BorderLayout.CENTER);
        add(infoAutoKolor, BorderLayout.SOUTH);
        add(infoAutoCzyDostepne, BorderLayout.AFTER_LINE_ENDS);
        add(wypożycz, BorderLayout.PAGE_START);


    }
}
