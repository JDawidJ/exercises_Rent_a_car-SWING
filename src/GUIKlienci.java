import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUIKlienci extends JPanel {

    JTable tabelaKlientow=new JTable();
    JButton dodajKlient=new JButton("dodaj");
    JButton usunKlienta=new JButton("usun");

    GUIKlienci() {
        add(dodajKlient);
        add(usunKlienta);
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();

        columns.add("Imie");

        columns.add("ID");




    for (int i = 0; i < Garaz.getListaKlientow().size(); i++) {
        values.add(new String[]{Garaz.getListaKlientow().get(i).getImie(),
                String.valueOf(Garaz.getListaKlientow().get(i).getIDklienta()),

        });



        }

        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());
        tabelaKlientow = new JTable(tableModel);
        add(new JScrollPane(tabelaKlientow), BorderLayout.CENTER);

    }
}
