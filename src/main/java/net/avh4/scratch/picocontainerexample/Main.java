package net.avh4.scratch.picocontainerexample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.show();
            }
        });
    }
}
