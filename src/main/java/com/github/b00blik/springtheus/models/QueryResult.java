package com.github.b00blik.springtheus.models;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class QueryResult {
    Map<String, String> metric;
    List<Float> value;
}
