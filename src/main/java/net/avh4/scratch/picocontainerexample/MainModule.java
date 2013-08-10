package net.avh4.scratch.picocontainerexample;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;

import javax.swing.*;

public class MainModule {
    public static PicoContainer newContainer() {
        final MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(PicoContainer.class, pico);
        pico.addComponent(MainWindow.class);
        pico.addComponent(JFrame.class);
        pico.addComponent(InfoWindowProvider.class);
        pico.addComponent(ShowInfoWindowAction.class);
        return pico;
    }
}
