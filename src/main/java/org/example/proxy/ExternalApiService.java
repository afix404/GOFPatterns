package org.example.proxy;

public interface ExternalApiService {
    String fetchData(String query, String token) throws IllegalAccessException;
}
