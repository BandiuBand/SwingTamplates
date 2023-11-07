package org.example;
import javax.swing.*;
import java.awt.*;

public class MixedForm {

    public static void main(String[] args) {
        // Створення фрейму
        JFrame frame = new JFrame("Mixed Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Панель з менеджером GridBagLayout для розміщення елементів
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Масиви назв для міток
        String[] labelNames = {"Field 1", "Field 2", "Combo 1", "Field 3", "Combo 2",
                "Field 4", "Field 5", "Field 6", "Field 7", "Field 8"};

        // Додавання елементів до панелі
        for (String labelName : labelNames) {
            panel.add(new JLabel(labelName), gbc);

            if (labelName.startsWith("Combo")) { // Для назв з "Combo" створюємо JComboBox
                JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
                panel.add(comboBox, gbc);
            } else { // Для інших - JTextField
                JTextField textField = new JTextField(10);
                panel.add(textField, gbc);
            }
        }

        // Кнопка для обробки даних
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Тут можна обробити дані
        });

        // Додавання скролу, якщо форма дуже велика
        JScrollPane scrollPane = new JScrollPane(panel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Додавання компонентів до фрейму
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(submitButton, BorderLayout.SOUTH);

        // Відображення вікна
        frame.setVisible(true);
    }
}
