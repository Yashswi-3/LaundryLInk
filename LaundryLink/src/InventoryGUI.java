import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InventoryGUI extends JFrame {
    private JFrame frame;
    private JLabel titleLabel, laundryIDLabel, clothesNumberLabel, clothesTypeLabel, clothesColorLabel;
    private JTextField laundryIDField, clothesNumberField, clothesTypeField, clothesColorField;
    private JButton addButton, deleteButton, resetButton, searchButton;
    private JTable clothesTable;
    private DefaultTableModel tableModel;

    private Connection conn;
    private PreparedStatement addStmt;
    private PreparedStatement deleteStmt;
    private PreparedStatement resetStmt;
    private PreparedStatement getAllStmt;

    private ImageIcon backgroundImage;

    public InventoryGUI() {

        frame = new JFrame("Inventory");
        frame.setSize(800, 750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("Inventory");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(330, 10, 150, 30);
        frame.add(titleLabel);

        laundryIDLabel = new JLabel("Laundry ID:");
        laundryIDLabel.setBounds(280, 60, 120, 20);
        laundryIDLabel.setHorizontalAlignment(JLabel.CENTER); // center content
        frame.add(laundryIDLabel);

        laundryIDField = new JTextField();
        laundryIDField.setBounds(410, 60, 120, 20);
        laundryIDField.setHorizontalAlignment(JTextField.CENTER); // center content
        frame.add(laundryIDField);

        clothesNumberLabel = new JLabel("Number of Clothes:");
        clothesNumberLabel.setBounds(280, 100, 120, 20);
        clothesNumberLabel.setHorizontalAlignment(JLabel.CENTER); // center content
        frame.add(clothesNumberLabel);

        clothesNumberField = new JTextField();
        clothesNumberField.setBounds(410, 100, 120, 20);
        clothesNumberField.setHorizontalAlignment(JTextField.CENTER); // center content
        frame.add(clothesNumberField);

        clothesTypeLabel = new JLabel("Type of Clothes:");
        clothesTypeLabel.setBounds(280, 140, 120, 20);
        clothesTypeLabel.setHorizontalAlignment(JLabel.CENTER); // center content
        frame.add(clothesTypeLabel);

        clothesTypeField = new JTextField();
        clothesTypeField.setBounds(410, 140, 120, 20);
        clothesTypeField.setHorizontalAlignment(JTextField.CENTER); // center content
        frame.add(clothesTypeField);

        clothesColorLabel = new JLabel("Color of Clothes:");
        clothesColorLabel.setBounds(280, 180, 120, 20);
        clothesColorLabel.setHorizontalAlignment(JLabel.CENTER); // center content
        frame.add(clothesColorLabel);

        clothesColorField = new JTextField();
        clothesColorField.setBounds(410, 180, 120, 20);
        clothesColorField.setHorizontalAlignment(JTextField.CENTER); // center content
        frame.add(clothesColorField);

        addButton = new JButton("Add");
        addButton.setBounds(340, 220, 80, 20);
        addButton.addActionListener(new ButtonActionListener());
        frame.add(addButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(340, 260, 80, 20);
        deleteButton.addActionListener(new ButtonActionListener());
        frame.add(deleteButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(340, 300, 80, 20);
        resetButton.addActionListener(new ButtonActionListener());
        frame.add(resetButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(340, 340, 80, 20);
        searchButton.addActionListener(new ButtonActionListener());
        frame.add(searchButton);

        String[] columnNames = {"Laundry ID", "Number of Clothes", "Type of Clothes", "Color of Clothes"};
        tableModel = new DefaultTableModel(columnNames, 0);
        clothesTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(clothesTable);
        scrollPane.setBounds(200, 400, 400, 110);
        frame.add(scrollPane);

        backgroundImage = new ImageIcon("Login.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 800,750);
        frame.add(backgroundLabel);

        frame.setVisible(true);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LaundryLink", "root", "BigBoss@333");

            addStmt = conn.prepareStatement("INSERT INTO INVENTORY (Laundry_ID, Num_Clothes, Type_Clothes, Color_Clothes) VALUES (?, ?, ?, ?)");
            deleteStmt = conn.prepareStatement("DELETE FROM INVENTORY WHERE Laundry_ID = ?");
            resetStmt = conn.prepareStatement("DELETE FROM INVENTORY");
            getAllStmt = conn.prepareStatement("SELECT * FROM INVENTORY");

            getAllClothes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getAllClothes() {
        try {
            ResultSet rs = getAllStmt.executeQuery();
            tableModel.setRowCount(0);
            while (rs.next()) {
                int laundryID = rs.getInt("Laundry_ID");
                int number = rs.getInt("Num_Clothes");
                String type = rs.getString("Type_Clothes");
                String color = rs.getString("Color_Clothes");
                Object[] rowData = {laundryID, number, type, color};
                tableModel.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                try {
                    int laundryID = Integer.parseInt(laundryIDField.getText());
                    int number = Integer.parseInt(clothesNumberField.getText());
                    String type = clothesTypeField.getText();
                    String color = clothesColorField.getText();

                    addStmt.setInt(1, laundryID);
                    addStmt.setInt(2, number);
                    addStmt.setString(3, type);
                    addStmt.setString(4, color);
                    addStmt.executeUpdate();

                    getAllClothes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (e.getSource() == deleteButton) {
                try {
                    int laundryID = Integer.parseInt(laundryIDField.getText());

                    deleteStmt.setInt(1, laundryID);
                    deleteStmt.executeUpdate();

                    getAllClothes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (e.getSource() == resetButton) {
                try {
                    resetStmt.executeUpdate();

                    getAllClothes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (e.getSource() == searchButton) {
                try {
                    int laundryID = Integer.parseInt(laundryIDField.getText());
                    PreparedStatement searchStmt = conn.prepareStatement("SELECT * FROM INVENTORY WHERE Laundry_ID = ?");
                    searchStmt.setInt(1, laundryID);
                    ResultSet rs = searchStmt.executeQuery();

                    tableModel.setRowCount(0);
                    if (rs.next()) {
                        int number = rs.getInt("Num_Clothes");
                        String type = rs.getString("Type_Clothes");
                        String color = rs.getString("Color_Clothes");
                        Object[] rowData = {laundryID, number, type, color};
                        tableModel.addRow(rowData);
                    } else {
                        JOptionPane.showMessageDialog(frame, "No record found with Laundry ID: " + laundryID, "Search Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InventoryGUI();
            }
        });
    }
}