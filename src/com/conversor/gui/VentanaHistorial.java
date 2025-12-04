package com.conversor.gui;

import com.conversor.modelo.HistorialEntrada;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaHistorial extends JDialog {

    public VentanaHistorial(JFrame parent, List<HistorialEntrada> historial) {
        super(parent, "Historial de Conversiones", true);
        setSize(480, 320);
        setLocationRelativeTo(parent);
        getContentPane().setBackground(new Color(40, 44, 52));
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitulo = new JLabel("Historial de conversiones", SwingConstants.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(lblTitulo, BorderLayout.NORTH);

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setBackground(new Color(30, 34, 40));
        areaTexto.setForeground(Color.CYAN);
        areaTexto.setFont(new Font("Consolas", Font.PLAIN, 13));

        if (historial.isEmpty()) {
            areaTexto.setText("No hay conversiones registradas aún.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (HistorialEntrada entrada : historial) {
                sb.append(entrada.getFormatoHistorial()).append("\n");
            }
            areaTexto.setText(sb.toString());
        }

        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(scroll, BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        JPanel panelBoton = new JPanel();
        panelBoton.setBackground(new Color(40, 44, 52));
        panelBoton.add(btnCerrar);
        add(panelBoton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
