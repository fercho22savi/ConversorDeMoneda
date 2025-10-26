package com.conversor.gui;

import com.conversor.servicio.ConversorServicio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.LinkedHashMap;
import java.util.Map;

public class VentanaPrincipal extends JFrame {
    private final JComboBox<String> comboDesde, comboHacia;
    private final JTextField txtValor;
    private final JLabel lblResultado;
    private final ConversorServicio servicio = new ConversorServicio();

    private final Map<String, String> monedas = new LinkedHashMap<>() {{
        put("USD", "Dólar estadounidense");
        put("COP", "Peso colombiano");
        put("ARS", "Peso argentino");
        put("BRL", "Real brasileño");
        put("EUR", "Euro");
        put("MXN", "Peso mexicano");
        put("GBP", "Libra esterlina");
    }};

    public VentanaPrincipal() {
        setTitle("Conversor de Monedas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(40, 44, 52));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel(" Conversor de Monedas", SwingConstants.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        comboDesde = new JComboBox<>(monedas.keySet().toArray(new String[0]));
        comboHacia = new JComboBox<>(monedas.keySet().toArray(new String[0]));
        comboDesde.setRenderer(new FlagListRenderer(monedas));
        comboHacia.setRenderer(new FlagListRenderer(monedas));

        gbc.gridy = 1; gbc.gridwidth = 1;
        add(comboDesde, gbc);
        gbc.gridx = 1;
        add(comboHacia, gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        txtValor = new JTextField();
        add(txtValor, gbc);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.addActionListener(this::convertirMoneda);
        gbc.gridy = 3;
        add(btnConvertir, gbc);

        lblResultado = new JLabel(" ", SwingConstants.CENTER);
        lblResultado.setForeground(Color.CYAN);
        lblResultado.setFont(new Font("Segoe UI", Font.BOLD, 16));
        gbc.gridy = 4;
        add(lblResultado, gbc);

        setVisible(true);
    }

    private void convertirMoneda(ActionEvent e) {
        try {
            String desde = comboDesde.getSelectedItem().toString();
            String hacia = comboHacia.getSelectedItem().toString();
            double valor = Double.parseDouble(txtValor.getText());
            double resultado = servicio.convertir(desde, hacia, valor);

            lblResultado.setText(String.format("%.2f %s = %.2f %s", valor, desde, resultado, hacia));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
