package com.github.b00blik.springtheus.models;

import lombok.Getter;

import java.util.List;

@Getter
public class QueryData {
    String resultType;
    List<QueryResult> result;
}