package net.avh4.scratch.picocontainerexample;

import javax.swing.*;

public class ShowInfoWindowButton extends JButton {
    public ShowInfoWindowButton(ShowInfoWindowAction showInfoWindowAction) {
        super("Show Info Window");
        addActionListener(showInfoWindowAction);
    }
}
