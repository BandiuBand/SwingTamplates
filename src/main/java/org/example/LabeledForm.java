package org.example;

import javax.swing.*;
import java.awt.*;

public class LabeledForm {

    public static void main(String[] args) {
        // Створення фрейму
        JFrame frame = new JFrame("Labeled Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Панель з менеджером GridBagLayout для розміщення елементів
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Масиви назв для міток
        String[] labels = {"Field 1", "Field 2", "Field 3", "Field 4", "Field 5",
                "Field 6", "Field 7", "Field 8", "Field 9", "Field 10"};

        // Створення міток та текстових полів
        for (int i = 0; i < labels.length; i++) {
            panel.add(new JLabel(labels[i]), gbc);
            panel.add(new JTextField(10), gbc);
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
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(submitButton, BorderLayout.SOUTH);

        // Відображення вікна
        frame.setVisible(true);
    }
}