package com.ui.component.button;

import com.ui.component.ComponentFactory;

import javax.swing.*;

public class ButtonFactory implements ComponentFactory {
    @Override
    public JButton getButton(String type, String label) {
        switch (type) {
            case "top":
                return new TopPanelButton(label);
            case "matching":
                return new MatchingPanelButton(label);
            case "lobby":
                return new LobbyPanelButton(label);
            case "game":
                break;
            case "dialog":
                return new DialogButton(label);
            default:
                return null;
        }
        return null;
    }

    @Override
    public JLabel getLabel(String type, String label) {
        return null;
    }
}
