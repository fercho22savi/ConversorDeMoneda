package com.conversor.api;

import com.conversor.modelo.Moneda;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMoneda {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/1845f80d9872757e33c1c8b5/latest/";

    public Moneda obtenerTasas(String codigoBase) throws IOException, InterruptedException {
        String url = API_URL + codigoBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Error al conectar con la API: " + response.statusCode());
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), Moneda.class);
    }
}
