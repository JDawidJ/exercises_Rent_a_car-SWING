import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class GUILogowanie extends JFrame {
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;
    GUILogowanie ponowneLogowanie;


    GUILogowanie() {
Klient klient=new Klient();
        JFrame frame = new JFrame("Wypozyczalnia aut 1.0 logowanie");
        l1 = new JLabel("Witaj w programie wypozyczlanie 1.0");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));

        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Login");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        p1.setBounds(300, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);

        frame.add(l1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(l3);
        frame.add(p1);
        frame.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = tf1.getText();
                char[] password = p1.getPassword();
                String myPassword = String.valueOf(password);

                if (userName.equals("a") && myPassword.equals("a")){

frame.setVisible(false);
                    new ProgramWypozyczlaniaAut(UserMethods.wezKlienta()).setVisible(true);
                    System.out.println("SUPER");}

                else {

                    l1.setText("BŁĄD LOGOWANIE ");
                    tf1.setText("");
                    p1.setText("");
                    System.out.println("nie super");
                }
            }
        });

        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


    }


}