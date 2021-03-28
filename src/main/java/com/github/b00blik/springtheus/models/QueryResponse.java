package com.github.b00blik.springtheus.models;

import lombok.Getter;

@Getter
public class QueryResponse {
    String status;
    QueryData data;
}