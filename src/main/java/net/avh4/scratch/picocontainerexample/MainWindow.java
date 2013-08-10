package net.avh4.scratch.picocontainerexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    JFrame window;
    private static int n;

    public MainWindow() {
        window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JButton button = new JButton("Show Info Window");
        button.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                InfoWindow infoWindow = new InfoWindow(++n);
                infoWindow.show();
            }
        });
        window.add(button);
    }

    public void show() {
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
