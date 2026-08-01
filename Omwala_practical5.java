package omwala_practical5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Omwala_practical5 extends JFrame implements ActionListener {

    JLabel title, l1, l2, l3, l4, l5, l6, l7, l8, l9;

    JTextField tfName, tfDob, tfEmail, tfPhone;

    JTextArea taAddress, taResume;

    JScrollPane spAddress, spResume;

    JRadioButton male, female, other;
    ButtonGroup gender;

    JComboBox<String> education;

    JCheckBox java, python, cpp, html;

    JButton submit, clear;

    Font titleFont = new Font("Arial", Font.BOLD, 34);
    Font labelFont = new Font("Arial", Font.BOLD, 16);
    Font fieldFont = new Font("Arial", Font.PLAIN, 14);

    public Omwala_practical5() {

        setTitle("Om Wala S119");
        setSize(520, 700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(210, 230, 255));

       
        title = new JLabel("Om Wala S119", SwingConstants.CENTER);
        title.setBounds(0, 10, 500, 50);
        title.setFont(titleFont);
        title.setOpaque(true);
        title.setBackground(new Color(255, 204, 0));
        title.setForeground(new Color(0, 0, 153));
        add(title);

        
        l1 = new JLabel("Full Name:");
        l1.setBounds(20, 90, 140, 25);
        l1.setFont(labelFont);
        add(l1);

        tfName = new JTextField();
        tfName.setBounds(180, 90, 280, 30);
        tfName.setFont(fieldFont);
        add(tfName);

        
        l2 = new JLabel("Gender:");
        l2.setBounds(20, 135, 140, 25);
        l2.setFont(labelFont);
        add(l2);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        male.setBounds(180, 135, 70, 25);
        female.setBounds(255, 135, 90, 25);
        other.setBounds(350, 135, 80, 25);

        Color bg = new Color(210, 230, 255);

        male.setBackground(bg);
        female.setBackground(bg);
        other.setBackground(bg);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        gender.add(other);

        add(male);
        add(female);
        add(other);

        
        l3 = new JLabel("Date of Birth:");
        l3.setBounds(20, 180, 150, 25);
        l3.setFont(labelFont);
        add(l3);

        tfDob = new JTextField();
        tfDob.setBounds(180, 180, 280, 30);
        tfDob.setFont(fieldFont);
        add(tfDob);

        
        l4 = new JLabel("Email:");
        l4.setBounds(20, 225, 140, 25);
        l4.setFont(labelFont);
        add(l4);

        tfEmail = new JTextField();
        tfEmail.setBounds(180, 225, 280, 30);
        tfEmail.setFont(fieldFont);
        add(tfEmail);

        
        l5 = new JLabel("Phone Number:");
        l5.setBounds(20, 270, 140, 25);
        l5.setFont(labelFont);
        add(l5);

        tfPhone = new JTextField();
        tfPhone.setBounds(180, 270, 280, 30);
        tfPhone.setFont(fieldFont);
        add(tfPhone);

        
        l6 = new JLabel("Address:");
        l6.setBounds(20, 315, 140, 25);
        l6.setFont(labelFont);
        add(l6);

        taAddress = new JTextArea();
        taAddress.setFont(fieldFont);
        taAddress.setLineWrap(true);

        spAddress = new JScrollPane(taAddress);
        spAddress.setBounds(180, 315, 280, 70);
        add(spAddress);

        
        l7 = new JLabel("Education:");
        l7.setBounds(20, 405, 140, 25);
        l7.setFont(labelFont);
        add(l7);

        String edu[] = {
                "SSC",
                "HSC",
                "BSc Computer Science",
                "MSc Computer Science",
                "Diploma",
                "Undergraduate",
                "Postgraduate"
        };

        education = new JComboBox<>(edu);
        education.setBounds(180, 405, 280, 30);
        education.setFont(fieldFont);
        add(education);

        
        l8 = new JLabel("Skills:");
        l8.setBounds(20, 450, 140, 25);
        l8.setFont(labelFont);
        add(l8);

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");
        html = new JCheckBox("Html");

        java.setBounds(180, 450, 70, 25);
        python.setBounds(255, 450, 80, 25);
        cpp.setBounds(340, 450, 60, 25);
        html.setBounds(405, 450, 70, 25);
        

        java.setBackground(bg);
        python.setBackground(bg);
        cpp.setBackground(bg);
        html.setBackground(bg);

        add(java);
        add(python);
        add(cpp);
        add(html);

       
        l9 = new JLabel("Resume Summary:");
        l9.setBounds(20, 495, 160, 25);
        l9.setFont(labelFont);
        add(l9);

        taResume = new JTextArea();
        taResume.setFont(fieldFont);
        taResume.setLineWrap(true);

        spResume = new JScrollPane(taResume);
        spResume.setBounds(180, 495, 280, 70);
        add(spResume);

        
        submit = new JButton("Submit");
        submit.setBounds(35, 595, 190, 45);
        submit.setBackground(new Color(0, 102, 204));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial", Font.BOLD, 18));
        submit.setBorder(new LineBorder(Color.BLACK));
        submit.addActionListener(this);
        add(submit);

        
        clear = new JButton("Clear");
        clear.setBounds(270, 595, 190, 45);
        clear.setBackground(new Color(255, 204, 0));
        clear.setForeground(Color.BLACK);
        clear.setFont(new Font("Arial", Font.BOLD, 18));
        clear.setBorder(new LineBorder(Color.BLACK));
        clear.addActionListener(this);
        add(clear);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            JOptionPane.showMessageDialog(
                    this,
                    "Resume Submitted Successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == clear) {

            tfName.setText("");
            tfDob.setText("");
            tfEmail.setText("");
            tfPhone.setText("");

            taAddress.setText("");
            taResume.setText("");

            gender.clearSelection();

            java.setSelected(false);
            python.setSelected(false);
            cpp.setSelected(false);
            html.setSelected(false);

            education.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Omwala_practical5();
            }
        });

    }
}