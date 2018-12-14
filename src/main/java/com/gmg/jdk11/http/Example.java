package com.gmg.jdk11.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example {
    public static void syncGet(String uri) throws Exception{
        HttpClient httpClient=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder().uri(URI.create(uri))
                .build();
        HttpResponse<String> response=httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }


}
