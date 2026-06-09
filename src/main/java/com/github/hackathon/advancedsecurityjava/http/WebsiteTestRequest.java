package com.github.hackathon.advancedsecurityjava.http;

public class WebsiteTestRequest {
    private String url;
    public String customHeaderKey;
    public String customHeaderValue;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCustomHeaderKey() {
        return customHeaderKey;
    }

    public void setCustomHeaderKey(String customHeaderKey) {
        this.customHeaderKey = customHeaderKey;
    }

    public String getCustomHeaderValue() {
        return customHeaderValue;
    }

    public void setCustomHeaderValue(String customHeaderValue) {
        this.customHeaderValue = customHeaderValue;
    }
}