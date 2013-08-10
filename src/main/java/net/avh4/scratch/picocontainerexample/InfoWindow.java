package net.avh4.scratch.picocontainerexample;

import javax.swing.*;

public class InfoWindow {
    private JFrame window;

    public InfoWindow(int n) {
        window = new JFrame("Info Window " + n);
    }

    public void show() {
        window.setSize(200, 100);
        window.setLocationByPlatform(true);
        window.setVisible(true);
    }
}
