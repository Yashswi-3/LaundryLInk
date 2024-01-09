import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JLabel l9;

    public static void main(String[] args) {

        // set up background image
        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("Login.jpg"));
        Image scaledBackgroundImage = backgroundImage.getImage().getScaledInstance(800, 750, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledBackgroundImage);
        JLabel backgroundLabel = new JLabel(scaledIcon);
        backgroundLabel.setBounds(0, 0, 800, 750);

        // set up logo image
        ImageIcon logoImage = new ImageIcon(ClassLoader.getSystemResource("logo1.png"));
        Image scaledLogoImage = logoImage.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);

        // set up logo label
        JLabel logoLabel = new JLabel(scaledLogoIcon);
        logoLabel.setBounds(90, -100, 600, 600);
        backgroundLabel.add(logoLabel);

        // set up main frame
        JFrame mainFrame = new JFrame("LaundryLink");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 780);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.add(backgroundLabel);

        // set up login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 24));
        loginButton.setBounds(140, 450, 150, 50);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage();
            }
        });
        backgroundLabel.add(loginButton);

        // set up signup button
        JButton signupButton = new JButton("Signup");
        signupButton.setFont(new Font("Arial", Font.PLAIN, 24));
        signupButton.setBounds(500, 450, 150, 50);
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SignupPage signupPage = new SignupPage();
            }
        });
        backgroundLabel.add(signupButton);

        mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Implement actionPerformed method here
    }
}
