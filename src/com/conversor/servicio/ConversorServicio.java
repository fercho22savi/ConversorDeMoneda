package com.conversor.servicio;

import com.conversor.api.ApiMoneda;
import com.conversor.modelo.Moneda;

public class ConversorServicio {

    private final ApiMoneda api = new ApiMoneda();

    public double convertir(String desde, String hacia, double valor) throws Exception {
        if (valor <= 0) throw new IllegalArgumentException("El valor debe ser mayor que cero.");
        if (desde.equals(hacia)) throw new IllegalArgumentException("Debe seleccionar monedas distintas.");

        Moneda moneda = api.obtenerTasas(desde);
        Double tasa = moneda.getConversion_rates().get(hacia);

        if (tasa == null) throw new IllegalArgumentException("No se encontró tasa de conversión para " + hacia);

        return valor * tasa;
    }
}
