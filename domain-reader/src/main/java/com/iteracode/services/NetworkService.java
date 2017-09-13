package com.iteracode.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetworkService {
    public String getDomain(String url) {
        int colonIndex = url.indexOf("://");
        String hostname = url.substring(colonIndex + 3);
        int dotIndex = hostname.indexOf('.');

        return hostname.substring(dotIndex + 1);
    }
}














/*
    private static final Pattern DOMAIN = Pattern.compile("http?://(www\\.)?(.+).*$");

    public String getDomain(String url) {

        Matcher matcher = DOMAIN.matcher(url);

        if (!matcher.matches()) {
            return url;
        }

        return matcher.group(2);
    }
*/



















// SOLUTION ;) : https?://(www\.)?([^:]+).*$