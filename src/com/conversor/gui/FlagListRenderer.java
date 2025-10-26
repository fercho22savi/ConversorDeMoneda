package com.conversor.gui;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.Map;

public class FlagListRenderer extends DefaultListCellRenderer {
    private final Map<String, String> nombresMonedas;

    public FlagListRenderer(Map<String, String> nombresMonedas) {
        this.nombresMonedas = nombresMonedas;
    }

    @Override
    public Component getListCellRendererComponent(
            JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        String code = value.toString();

        try {
            InputStream is = getClass().getResourceAsStream("/flags/" + code + ".png");
            if (is != null) {
                ImageIcon icon = new ImageIcon(is.readAllBytes());
                Image scaled = icon.getImage().getScaledInstance(24, 16, Image.SCALE_SMOOTH);
                label.setIcon(new ImageIcon(scaled));
            }
        } catch (Exception e) {
            // Si no se encuentra la bandera, se ignora
        }

        label.setText(code + " - " + nombresMonedas.getOrDefault(code, "Desconocido"));
        label.setHorizontalTextPosition(SwingConstants.RIGHT);
        return label;
    }
}
