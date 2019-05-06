package com.example.circuitbreaker;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.net.URI;

@Service
public class MenuService {
    private final RestTemplate restTemplate;

    public MenuService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public String testCall() {
        URI uri = URI.create("http://localhost:3000/home");
        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliable() {
        return "Test Service unavailable please try again";
    }
}