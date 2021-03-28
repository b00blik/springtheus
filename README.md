# Springtheus

Simple Spring Boot client for getting metrics from Prometheus by queries on HTTP API.

## Configuring

Set Prometheus service URL in your service's `application.properties`:

```
prometheus.baseUrl=http://prometheus.url
```

## Usage

Wire `PrometheusApiClient` in your service:

```
...
private final PrometheusApiClient client;
...
```

Get results by performing query:

```
QueryResponse response = client.query("container_memory_usage_bytes");
```

## Licence
This software is distributed under the BSD License.