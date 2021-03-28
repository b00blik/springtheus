package com.github.b00blik.springtheus.client;

import com.github.b00blik.springtheus.models.QueryResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class PrometheusApiClient {

    private final PrometheusRestService service;

    public QueryResponse query(String query) throws IOException {
        return service.query(query).execute().body();
    }

}