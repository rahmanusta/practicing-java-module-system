package com.kodedu.http2.client;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

import static jdk.incubator.http.HttpRequest.BodyPublisher.fromString;

public class PostClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://127.0.0.1:8443/post"))
                .POST(fromString("Hi Devoxxians!"))
                .build();

        HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandler.asString());

        HttpClient.Version version = httpResponse.version();
        int statusCode = httpResponse.statusCode();
        String body = httpResponse.body();

        System.out.println("Version: " + version);
        System.out.println("Body: " + body);
        System.out.println("Status code: " + statusCode);

    }
}
