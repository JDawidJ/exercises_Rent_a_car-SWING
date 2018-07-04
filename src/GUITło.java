import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITło extends JPanel  {
    GUIWyborDzialania wyborDzialania=new GUIWyborDzialania();
public static     GUIListaAutDostepnych listaAutDostepnych=new GUIListaAutDostepnych();
    GUIInformacjeAuto informacjeAuto=new GUIInformacjeAuto();
    GUIKlienci klienci=new GUIKlienci();

    GUITło( ){


        setLayout(new BorderLayout());

        add(wyborDzialania,BorderLayout.NORTH);
        add(listaAutDostepnych,BorderLayout.CENTER);
        add(informacjeAuto,BorderLayout.SOUTH);


        listaAutDostepnych.setVisible(true);
        informacjeAuto.setVisible(true);

        wyborDzialania.przyciskAuta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                klienci.setVisible(false);
                listaAutDostepnych.setVisible(true);
                informacjeAuto.setVisible(true);
            }
        });

        wyborDzialania.przyciskKlienci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listaAutDostepnych.setVisible(false);
                informacjeAuto.setVisible(false);
                add(klienci,BorderLayout.CENTER);
                klienci.setVisible(true);
            }
        });

       /* add(new GUIWyborDzialania(),BorderLayout.NORTH);
        add(new GUIListaAutDostepnych().setVisible(false),BorderLayout.CENTER);
        add(new GUIInformacjeAuto(),BorderLayout.SOUTH);
        add()*/


    }
}
