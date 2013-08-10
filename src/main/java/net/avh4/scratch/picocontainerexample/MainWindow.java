package net.avh4.scratch.picocontainerexample;

import javax.swing.*;

public class MainWindow {
    JFrame window;

    public MainWindow(JFrame window, ShowInfoWindowButton showInfoWindowButton) {
        this.window = window;
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(showInfoWindowButton);
    }

    public void show() {
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
