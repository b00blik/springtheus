package com.github.b00blik.springtheus.config;

import com.github.b00blik.springtheus.client.PrometheusApiClient;
import com.github.b00blik.springtheus.client.PrometheusRestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
@ComponentScan(basePackages = "com.github.b00blik.springtheus")
public class PrometheusQueryConfiguration {

    @Value("${prometheus.baseUrl}")
    private String baseUrl;

    @Bean
    public PrometheusApiClient buildApiClient(){
        return new PrometheusApiClient(buildPrometheusRest());
    }

    @Bean
    public PrometheusRestService buildPrometheusRest(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(PrometheusRestService.class);
    }

}
