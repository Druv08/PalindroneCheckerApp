//version 1.0
//author Druv
//useCase: Welcome page

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Palindrome Checker App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Text:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Check Palindrome");
        JLabel result = new JLabel("");

        button.addActionListener(e -> {
            String text = textField.getText().toLowerCase().replaceAll("[^a-z0-9]", "");
            String reverse = new StringBuilder(text).reverse().toString();

            if (text.equals(reverse)) {
                result.setText("Palindrome!");
            } else {
                result.setText("Not Palindrome!");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}