import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupPage extends JFrame implements ActionListener {
    private JTextField usernameField, laundryIDField;
    private JPasswordField passwordField;
    private JButton studentButton, btn4;
    public SignupPage() {
        setSize(1400,900);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        // Set the layout
        setLayout(null);

        // Add a logo
        ImageIcon logo1 = new ImageIcon(ClassLoader.getSystemResource("logo3.png"));
        JLabel logoLabel = new JLabel(logo1);
        logoLabel.setBounds(450, -130, 600, 600);
        add(logoLabel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400, 900);
        add(l3);

        JLabel signupLabel = new JLabel("SIGNUP");
        signupLabel.setFont(new Font("Osward", Font.BOLD, 60));
        signupLabel.setForeground(Color.ORANGE);
        signupLabel.setBounds(600, 270, 300, 70);
        l3.add(signupLabel);

        JLabel usernameLabel = new JLabel("USERNAME");
        usernameLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(470, 400, 200, 30);
        l3.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(700, 400, 230, 30);
        l3.add(usernameField);

        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(470, 470, 200, 30);
        l3.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(700, 470, 230, 30);
        l3.add(passwordField);

        // Add a new JLabel and JTextField for LAUNDRY_ID
        JLabel laundryIDLabel = new JLabel("LAUNDRY_ID");
        laundryIDLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        laundryIDLabel.setForeground(Color.WHITE);
        laundryIDLabel.setBounds(470, 540, 200, 30);
        l3.add(laundryIDLabel);

        laundryIDField = new JTextField();
        laundryIDField.setBounds(700, 540, 230, 30);
        l3.add(laundryIDField);

        studentButton = new JButton("SIGNUP As Student");
        studentButton.setBackground(Color.BLACK);
        studentButton.setForeground(Color.WHITE);
        studentButton.setBounds(600, 630, 200, 45);
        studentButton.addActionListener(this);
        l3.add(studentButton);

        btn4 = new JButton("LOGIN");
        btn4.setBackground(Color.BLUE);
        btn4.setForeground(Color.YELLOW);
        btn4.setBounds(630, 700, 130, 30);
        l3.add(btn4);
        btn4.addActionListener(this);
        setVisible(true);

    }


            public void actionPerformed(ActionEvent ae) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String laundryID = laundryIDField.getText(); // Get the LAUNDRY_ID
        String table = "";
        String message = "";

        if (ae.getSource() == studentButton) {
            table = "main";
            message = "SUCCESSFULLY SIGNUP AS STUDENT";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundrylink", "root", "BigBoss@333");
                Statement st = con.createStatement();
                String query = "INSERT INTO " + table + " ( User_ID, Passward,  Laundry_ID) VALUES('" + username + "', '" + password + "', '" + laundryID + "')"; // Update the query
                st.executeUpdate(query);

                JOptionPane.showMessageDialog(null, message);

             //   new LoginPage();
                setVisible(false);

                con.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == btn4) {
            // Run Signup.java file
            try {
                new LoginPage().setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}