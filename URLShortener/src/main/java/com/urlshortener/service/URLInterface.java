package com.urlshortener.service;

public interface URLInterface {
    String findUrlById(String id);

    void storeUrl(String id, String url);
}
