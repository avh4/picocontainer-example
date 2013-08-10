package net.avh4.scratch.picocontainerexample;

import javax.swing.*;

public class MainWindow {
    JFrame window;

    public MainWindow(JFrame window, ShowInfoWindowAction showInfoWindowAction) {
        this.window = window;
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JButton button = new JButton("Show Info Window");
        button.addActionListener(showInfoWindowAction);
        window.add(button);
    }

    public void show() {
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
