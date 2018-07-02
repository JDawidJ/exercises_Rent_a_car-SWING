import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWyborDzialania extends JPanel {
JButton przyciskKlienci =new JButton("klienci");
JButton przyciskAuta =new JButton("auta");



GUIWyborDzialania(){

    add(przyciskAuta);
    add(przyciskKlienci);

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
