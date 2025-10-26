package com.conversor.principal;

import com.formdev.flatlaf.FlatDarkLaf;
import com.conversor.gui.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        FlatDarkLaf.setup(); // Estilo moderno
        new VentanaPrincipal();
    }
}
