import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GUIListaAutDostepnych extends JPanel  {
JTable tabelaAut =new JTable();
    JButton przyciskDodajAuto =new JButton("Dodaj");
    JButton przyciskUsunAuto =new JButton("Usun");
  public static   TableModel tableModel;


    GUIListaAutDostepnych() {
        add(przyciskDodajAuto);
      add(przyciskUsunAuto);
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();

        columns.add("Marka");
        columns.add("Model");
        columns.add("Ceana");
     columns.add("CzyDostepne");
        columns.add("ID");
try{

        for (int i = 0; i < Garaz.getListaWszystkichAut().size(); i++) {
            values.add(new String[]{Garaz.getListaWszystkichAut().get(i).getSpecyfikacja().getMarka(),
                    Garaz.getListaWszystkichAut().get(i).getSpecyfikacja().getModel(),
                    String.valueOf(Garaz.getListaWszystkichAut().get(i).getCenaAuta()),
                    String.valueOf(Garaz.getListaWszystkichAut().get(i).isCzyDostepneAuto()),
                    String.valueOf(Garaz.getListaWszystkichAut().get(i).getIDauta()),

            });
        }


        }catch (NullPointerException ex)
{
    ex.getMessage();
}
        tableModel = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());
         tabelaAut = new JTable(tableModel);
        add(new JScrollPane(tabelaAut), BorderLayout.CENTER);


        tabelaAut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int watosc = Integer.parseInt(tabelaAut.getValueAt(tabelaAut.getSelectedRow(), 4).toString())-1;

                GUIInformacjeAuto.infoAutoMarka.setText("Marka: "+Garaz.getListaWszystkichAut().get(watosc).getSpecyfikacja().getMarka());
               GUIInformacjeAuto.infoAutoSilnik.setText("Silnik: "+String.valueOf(Garaz.getListaWszystkichAut().get(watosc).getSpecyfikacja().getSilnik()));
                GUIInformacjeAuto.infoAutoKolor.setText("Kolor: "+String.valueOf(Garaz.getListaWszystkichAut().get(watosc).getSpecyfikacja().getKolor()));




                if(Garaz.getListaWszystkichAut().get(watosc).isCzyDostepneAuto()==true)

                { GUIInformacjeAuto.infoAutoCzyDostepne.setText("DOSTĘPNE");
                    GUIInformacjeAuto.infoAutoCzyDostepne.setForeground(Color.GREEN);}
                else {
                GUIInformacjeAuto.infoAutoCzyDostepne.setText("NIEDOSTĘPNE");
                    GUIInformacjeAuto.infoAutoCzyDostepne.setForeground(Color.red);}

            }
        });
przyciskDodajAuto.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GUIDodajAuto();
    }
});
GUIInformacjeAuto.wypożycz.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

/*
    GUIInformacjeAuto.infoAutoKolor.setText(" wpisz ID KLIENAT: ");

    GUIInformacjeAuto.infoAutoCzyDostepne.setVisible(false);
    GUIInformacjeAuto.infoAutoSilnik.setVisible(false);
*/



    }
});
    }


}


