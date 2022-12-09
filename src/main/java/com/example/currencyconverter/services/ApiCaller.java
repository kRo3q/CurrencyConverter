package com.example.currencyconverter.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCaller {

    public static void getExchangeRate(String date) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.nbp.pl/api/exchangerates/rates/c/usd/" + date + "/?format=json"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
