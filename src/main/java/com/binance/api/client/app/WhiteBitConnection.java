package com.binance.api.client.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WhiteBitConnection {
    private static final String API_KEY = ""; //TODO: put here your public key
    private static final String API_SECRET = ""; //TODO: put here your secret key

    private static final String URL = "https://whitebit.com"; // Domain
    private static final String BALANCE_METHOD = "/api/v4/public/orderbook/USDT_UAH?limit=100&level=2"; // Method

    public static String getWBAsk() throws Exception {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + BALANCE_METHOD))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String wbresponse = response.body();
        String wbAsk = wbresponse.split(",")[1].split("\"")[3];

        return wbAsk;
    }

    public static String getWBBid() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + BALANCE_METHOD))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String wbresponse = response.body();
        String wbBid = wbresponse.split("\"bids\":")[1].split(",")[0].substring(3).split("\"")[0];

        return wbBid;
    }
}

