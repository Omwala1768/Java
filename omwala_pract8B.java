package omwala_pract8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class omwala_pract8B extends JFrame implements ActionListener {

    JLabel title, idLabel, nameLabel, emailLabel, courseLabel, marksLabel;
    JTextField idField, nameField, emailField, courseField, marksField;
    JButton submitButton, clearButton;

    String url = "jdbc:mysql://localhost:3306/test_db";
    String user = "root";
    String password = "root";

    omwala_pract8B() {

        setTitle("Student Record Form");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(245, 248, 250));

        title = new JLabel("Student Record Form");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(130, 25, 280, 40);
        add(title);

        idLabel = new JLabel("Student ID:");
        idLabel.setBounds(60, 90, 120, 30);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 90, 220, 30);
        add(idField);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(60, 140, 120, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 140, 220, 30);
        add(nameField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(60, 190, 120, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(190, 190, 220, 30);
        add(emailField);

        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(60, 240, 120, 30);
        add(courseLabel);

        courseField = new JTextField();
        courseField.setBounds(190, 240, 220, 30);
        add(courseField);

        marksLabel = new JLabel("Marks:");
        marksLabel.setBounds(60, 290, 120, 30);
        add(marksLabel);

        marksField = new JTextField();
        marksField.setBounds(190, 290, 220, 30);
        add(marksField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(130, 350, 100, 35);
        submitButton.addActionListener(this);
        add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(260, 350, 100, 35);
        clearButton.addActionListener(this);
        add(clearButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String email = emailField.getText();
                String course = courseField.getText();
                int marks = Integer.parseInt(marksField.getText());

                Connection con = DriverManager.getConnection(
                        url, user, password
                );

                String query = "INSERT INTO student " +
                        "(id, name, email, course, marks) " +
                        "VALUES (?, ?, ?, ?, ?)";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, email);
                pst.setString(4, course);
                pst.setInt(5, marks);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(
                        this,
                        "Record inserted successfully!"
                );

                pst.close();
                con.close();

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "ID and Marks must be numbers."
                );

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Database Error: " + ex.getMessage()
                );
            }
        }

        if (e.getSource() == clearButton) {
            idField.setText("");
            nameField.setText("");
            emailField.setText("");
            courseField.setText("");
            marksField.setText("");
        }
    }

    public static void main(String[] args) {

        System.out.println("Om Wala S119");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "MySQL JDBC Driver not found!"
            );
        }

        new omwala_pract8B();
    }
}