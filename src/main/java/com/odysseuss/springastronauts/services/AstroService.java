package com.odysseuss.springastronauts.services;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.odysseuss.springastronauts.records.AstroResult;

@Service
public class AstroService {
    private final RestTemplate restTemplate;

    @Autowired
    public AstroService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public AstroResult getAstronauts() {
        
        String url = "http://api.open-notify.org/astros.json";

        return Optional.ofNullable(restTemplate.getForObject(url, AstroResult.class))
                .orElse(new AstroResult("fail", 0, Collections.emptyList()));
    }


    
    
}
