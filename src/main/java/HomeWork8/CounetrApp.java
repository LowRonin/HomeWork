package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class CounetrApp extends JFrame {

        private int value;

        public CounetrApp(int initialValue) {
            this.value = initialValue;
            setBounds(500, 500, 1100, 200);
            setTitle("SymbolCounter");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Font font = new Font("Arial", Font.BOLD, 120);
            JLabel counterValue = new JLabel(String.valueOf(value));
            counterValue.setFont(font);
            counterValue.setHorizontalAlignment(SwingConstants.CENTER);
            JPanel westPanel = new JPanel();
            JPanel centPanel = new JPanel();
            JPanel eastPanel = new JPanel();
            add(westPanel, BorderLayout.WEST);
            add(eastPanel, BorderLayout.EAST);
            add(centPanel, BorderLayout.CENTER);
            centPanel.add(counterValue);

            JButton decrement = new JButton("<");
            decrement.setFont(font);
            westPanel.add(decrement);

            JButton increment = new JButton(">");
            increment.setFont(font);
            eastPanel.add(increment);

            decrement.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value--;
                    counterValue.setText(String.valueOf(value));
                }
            });
            increment.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value++;
                    counterValue.setText(String.valueOf(value));
                }
            });

            JButton decrement10 = new JButton("<10");
            decrement10.setFont(font);
            westPanel.add(decrement10);

            JButton increment10 = new JButton("10>");
            increment10.setFont(font);
            eastPanel.add(increment10);

            increment10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value += 10;
                    counterValue.setText(String.valueOf(value));
                }
            });

            decrement10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value -= 10;
                    counterValue.setText(String.valueOf(value));
                }
            });

            setVisible(true);
        }

        public static void main(String[] args) {
            new CounetrApp(0);
        }
    }
