package net.avh4.scratch.picocontainerexample;

import org.picocontainer.PicoContainer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final PicoContainer pico = MainModule.newContainer();

        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                MainWindow mainWindow = pico.getComponent(MainWindow.class);
                mainWindow.show();
            }
        });
    }
}
