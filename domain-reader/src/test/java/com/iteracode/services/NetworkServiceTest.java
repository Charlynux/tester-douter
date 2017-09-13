package com.iteracode.services;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NetworkServiceTest {

    NetworkService service;

    @Before
    public void setUp(){
        service = new NetworkService();
    }

    @Test
    public void it_should_work_when_scheme_is_http() {
        assertThat(service.getDomain("http://www.latechamienoise.com")).isEqualTo("latechamienoise.com");
    }

    @Test
    public void it_should_work_when_scheme_is_https() {
        assertThat(service.getDomain("https://www.youtube.com")).isEqualTo("youtube.com");
    }

    @Test
    public void it_should_work_when_no_www() {
        assertThat(service.getDomain("http://localhost")).isEqualTo("localhost");
    }

}