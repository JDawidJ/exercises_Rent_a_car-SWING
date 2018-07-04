import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWyborDzialania extends JPanel {
JButton przyciskKlienci =new JButton("klienci");
JButton przyciskAuta =new JButton("auta");
/*
JButton przyciskDodajAuto =new JButton("Dodaj");
JButton przyciskUsunAuto =new JButton("Usun");
*/



GUIWyborDzialania(){

    add(przyciskAuta);
    add(przyciskKlienci);
   /* add(przyciskDodajAuto);
    add(przyciskUsunAuto);*/

/*przyciskAuta.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GUIListaAutDostepnych();
    }
});
przyciskKlienci.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GUIKlienci();
    }
});*/

}

}
