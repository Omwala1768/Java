package com.mycompany.omwala_pract8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Omwala_pract8 extends JFrame implements ActionListener {

    JTextField display;
    double num1, num2, result;
    char operator;

    public Omwala_pract8() {

        setTitle("Om Wala S119 - Calculator");
        setSize(400, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(35, 45, 65));

        display = new JTextField("0");
        display.setFont(new Font("Segoe UI", Font.BOLD, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(new Color(25, 30, 40));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));

        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 8, 8));
        panel.setBackground(new Color(35, 45, 65));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {

            JButton button = new JButton(text);

            button.setFont(new Font("Segoe UI", Font.BOLD, 22));
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setOpaque(true);

            if (text.equals("+") || text.equals("-") ||
                text.equals("*") || text.equals("/")) {

                button.setBackground(new Color(255, 145, 0));
                button.setForeground(Color.WHITE);

            } else if (text.equals("=")) {

                button.setBackground(new Color(50, 200, 80));
                button.setForeground(Color.WHITE);

            } else {

                button.setBackground(new Color(50, 130, 220));
                button.setForeground(Color.WHITE);
            }

            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        JButton clear = new JButton("CLEAR");

        clear.setFont(new Font("Segoe UI", Font.BOLD, 20));
        clear.setBackground(new Color(230, 55, 65));
        clear.setForeground(Color.WHITE);
        clear.setFocusPainted(false);
        clear.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        clear.addActionListener(this);

        add(clear, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.matches("[0-9.]")) {

            if (display.getText().equals("0")) {
                display.setText(command);
            } else {
                display.setText(display.getText() + command);
            }
        }

        else if (command.equals("+") ||
                 command.equals("-") ||
                 command.equals("*") ||
                 command.equals("/")) {

            if (display.getText().isEmpty()) {
                return;
            }

            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        }

        else if (command.equals("=")) {

            if (display.getText().isEmpty()) {
                return;
            }

            num2 = Double.parseDouble(display.getText());

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        display.setText("Error");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
        }

        else if (command.equals("CLEAR")) {

            display.setText("0");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        new Omwala_pract8();
    }
}