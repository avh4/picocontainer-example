package net.avh4.scratch.picocontainerexample;

import org.picocontainer.PicoContainer;

import javax.swing.*;

public class InfoWindowProvider {
    private final PicoContainer pico;

    public InfoWindowProvider(PicoContainer pico) {
        this.pico = pico;
    }

    public InfoWindow get(int n) {
        final JFrame jFrame = pico.getComponent(JFrame.class);
        return new InfoWindow(n, jFrame);
    }
}
