package net.avh4.scratch.picocontainerexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    JFrame window;
    private static int n;

    public MainWindow(JFrame window, final InfoWindowProvider provider) {
        this.window = window;
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JButton button = new JButton("Show Info Window");
        button.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                InfoWindow infoWindow = provider.get(++n);
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
