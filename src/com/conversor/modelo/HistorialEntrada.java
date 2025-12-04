package com.conversor.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistorialEntrada {
    private String monedaOrigen;
    private String monedaDestino;
    private double monto;
    private double resultado;
    private LocalDateTime fechaHora;

    public HistorialEntrada(String monedaOrigen, String monedaDestino, double monto, double resultado) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.monto = monto;
        this.resultado = resultado;
        this.fechaHora = LocalDateTime.now();
    }

    public String getFormatoHistorial() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("[%s]  %.2f %s  →  %.2f %s",
                fechaHora.format(formatter), monto, monedaOrigen, resultado, monedaDestino);
    }
}
