import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDodajAuto extends JFrame {
    JPanel panelDodajAuto = new JPanel();
    JLabel IdAuta = new JLabel("IdAuta");
    JLabel nazwaAuta = new JLabel("nazwaAuta");
    JLabel cenaAuta = new JLabel("cenaAuta");

    JTextField idAutaTekst = new JTextField("idAutaTekst");
    JTextField nazwaAutatekstField = new JTextField("JtekstField");
    JTextField cenaAutatekst = new JTextField("cenaAutatekst");

    JButton dodajAuto = new JButton("DODAJ");

    GUIDodajAuto() {

        Font font = new Font("font", Font.BOLD, 30);
        add(panelDodajAuto);
        panelDodajAuto.setFont(font);
        IdAuta.setFont(font);
        idAutaTekst.setFont(font);
        nazwaAuta.setFont(font);
        nazwaAutatekstField.setFont(font);
        cenaAuta.setFont(font);
        cenaAutatekst.setFont(font);

        panelDodajAuto.add(IdAuta);
        panelDodajAuto.add(idAutaTekst);

        panelDodajAuto.add(nazwaAuta);
        panelDodajAuto.add(nazwaAutatekstField);

        panelDodajAuto.add(cenaAuta);
        panelDodajAuto.add(cenaAutatekst);

        panelDodajAuto.add(dodajAuto);

        setSize(600, 300);
        setTitle("dodawanieAuta");
        setLocationRelativeTo(null);
        pack();
        //setDefaultCloseOperation(3);
        setVisible(true);


        dodajAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idInt = Integer.parseInt(idAutaTekst.getText());
                String nazwaString = nazwaAutatekstField.getText();
                int cenaAutaInt = Integer.parseInt(cenaAutatekst.getText());
                UserMethods.dodajAuto(idInt, nazwaString, cenaAutaInt);
                GUITło.listaAutDostepnych.validate();
                System.out.println(Garaz.getListaWszystkichAut());
            }
        });

    }
}
