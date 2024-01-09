import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ClothDonationProgramWithDatabase extends JFrame implements ActionListener {
    // declare variables
    private JLabel enrollmentNumLabel, numOfClothesLabel, typeOfClothesLabel;
    private JTextField enrollmentNumField, numOfClothesField, typeOfClothesField;
    private JButton submitButton,clearButton;
    private Connection conn;
    private PreparedStatement ps;

    public ClothDonationProgramWithDatabase() {
        // set up GUI components
        enrollmentNumLabel = new JLabel("Enrollment Number:");
        numOfClothesLabel = new JLabel("Number of Clothes:");
        typeOfClothesLabel = new JLabel("Type of Clothes:");
        enrollmentNumField = new JTextField(10);
        numOfClothesField = new JTextField(10);
        typeOfClothesField = new JTextField(10);
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        // add action listener to submit button
        submitButton.addActionListener(this);

        // set layout and add components to the frame
        setLayout(new GridLayout(4, 2));
        add(enrollmentNumLabel);
        add(enrollmentNumField);
        add(numOfClothesLabel);
        add(numOfClothesField);
        add(typeOfClothesLabel);
        add(typeOfClothesField);
        add(submitButton);
        add(clearButton);

        // set window properties
        setTitle("Cloth Donation Program");
        setSize(600, 300);
        setLocationRelativeTo(null); // center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // connect to MySQL database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundrylink", "root", "BigBoss@333");
            ps = conn.prepareStatement("INSERT INTO donation ( Enroll_no,num_cloth, Type_cloth) VALUES (?, ?, ?)");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Could not connect to database.");
        }
    }

    public void actionPerformed(ActionEvent e) {
        // handle button click event
        if (e.getSource() == submitButton) {
            // get input values
            String enrollmentNum = enrollmentNumField.getText();
            int numOfClothes = Integer.parseInt(numOfClothesField.getText());
            String typeOfClothes = typeOfClothesField.getText();

            // insert values into database
            try {
                ps.setString(1, enrollmentNum);
                ps.setInt(2, numOfClothes);
                ps.setString(3, typeOfClothes);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data inserted successfully.");

                // clear input fields
                enrollmentNumField.setText("");
                numOfClothesField.setText("");
                typeOfClothesField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: Could not insert data into database.");
            }
        }
    }

    public static void main(String[] args) {
        // create instance of ClothDonationProgramWithDatabase
        new ClothDonationProgramWithDatabase();
    }
}