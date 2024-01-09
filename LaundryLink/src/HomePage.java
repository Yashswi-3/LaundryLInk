import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener {
    JLabel l9;

    public static void main(String[] args) {

        // set up background image
        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("homebgi.png"));
        Image scaledBackgroundImage = backgroundImage.getImage().getScaledInstance(800, 750, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledBackgroundImage);
        JLabel backgroundLabel = new JLabel(scaledIcon);
        backgroundLabel.setBounds(0, 0, 800, 750);

        // set up logo image
        ImageIcon logoImage = new ImageIcon(ClassLoader.getSystemResource("bennlogo.png"));
        Image scaledLogoImage = logoImage.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);

        // set up logo label
        JLabel logoLabel = new JLabel(scaledLogoIcon);
        logoLabel.setBounds(90, -100, 600, 600);
        backgroundLabel.add(logoLabel);

        // set up main frame
        JFrame mainFrame = new JFrame("Home Page");
       // mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 780);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.add(backgroundLabel);

        // set up inventory button
        JButton inventoryButton = new JButton("Inventory");
        inventoryButton.setFont(new Font("Arial", Font.PLAIN, 24));
        inventoryButton.setBounds(280, 350, 200, 50);
        inventoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle button click event
                new InventoryGUI();
            }
        });
        backgroundLabel.add(inventoryButton);

        // set up laundry button
        JButton laundryButton = new JButton("Laundry");
        laundryButton.setFont(new Font("Arial", Font.PLAIN, 24));
        laundryButton.setBounds(280, 425, 200, 50);
        laundryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle button click event
                new NewJFrame();
            }
        });
        backgroundLabel.add(laundryButton);

        // set up donation button
        JButton donationButton = new JButton("Donation");
        donationButton.setFont(new Font("Arial", Font.PLAIN, 24));
        donationButton.setBounds(280, 500, 200, 50);
        donationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle button click event
                new  ClothDonationProgramWithDatabase() ;
            }
        });
        backgroundLabel.add(donationButton);

        mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Implement actionPerformed method here
    }
}
