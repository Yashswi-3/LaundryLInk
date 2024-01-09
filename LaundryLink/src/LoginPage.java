import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel l1, l2, l4;
    JTextField tf1;
    JPasswordField pf2;
    JButton btn1, btn2, btn3, btn4;

    LoginPage() {
        super("LOGIN");

        // Set the background image
        JLabel l3 = new JLabel(new ImageIcon(new ImageIcon(ClassLoader.getSystemResource("Login.jpg")).getImage().getScaledInstance(1400, 900, Image.SCALE_DEFAULT)));
        l3.setBounds(0, 0, 1400, 900);
        add(l3);

        // Set the logo
        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("logo3.png")));
        logo.setBounds(450, -140, 600, 600);
        l3.add(logo);

        // Set the title
        l1 = new JLabel("LOGIN");
        l1.setFont(new Font("Osward", Font.BOLD, 60));
        l1.setForeground(Color.orange);

        // Set the username label and text field
        l2 = new JLabel("USERNAME");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setForeground(Color.WHITE);
        tf1 = new JTextField(15);

        // Set the password label and password field
        l4 = new JLabel("PASSWORD");
        l4.setFont(new Font("Raleway", Font.BOLD, 28));
        l4.setForeground(Color.WHITE);
        pf2 = new JPasswordField(15);

        // Set the login buttons
        btn2 = new JButton("LOGIN");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn4 = new JButton("SIGNUP");
        btn4.setBackground(Color.BLUE);
        btn4.setForeground(Color.YELLOW);

        // Set the layout and add components
        setLayout(null);
        l1.setBounds(620, 270, 300, 70);
        l3.add(l1);

        l2.setBounds(470, 400, 200, 30);
        l3.add(l2);

        tf1.setBounds(700, 400, 230, 30);
        l3.add(tf1);

        l4.setBounds(470, 470, 200, 30);
        l3.add(l4);

        pf2.setBounds(700, 470, 230, 30);
        l3.add(pf2);

        btn2.setBounds(590, 600, 200, 50);
        l3.add(btn2);

        btn4.setBounds(620, 700, 130, 30);
        l3.add(btn4);

        btn2.addActionListener(this);
        btn4.addActionListener(this);

        // Set frame properties
        setSize(1400,900);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tf1.getText();
            String password = pf2.getText();
            String host = "localhost";
            String dbUsername = "root";
            String dbPassword = "BigBoss@333";
            String dbName = "laundrylink";
            String tableName = "main";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + dbName + "?characterEncoding=latin1", dbUsername, dbPassword);
            Statement stmt = con.createStatement();

            if (ae.getSource() == btn2) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE User_ID='" + username + "' AND  Passward='" + password + "'");
                if (rs.next()) {
                    setVisible(false);
                    new HomePage(); // Redirect to the home page
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                    tf1.setText("");
                    pf2.setText("");
                }
            } else if (ae.getSource() == btn4) {
                new SignupPage().setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }


    public static void main(String[] args) {
        new LoginPage();
    }
}
