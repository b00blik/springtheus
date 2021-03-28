package com.github.b00blik.springtheus.client;

import com.github.b00blik.springtheus.models.QueryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PrometheusRestService {
    @GET("api/v1/query")
    Call<QueryResponse> query(
            @Query("query") String query
    );
}