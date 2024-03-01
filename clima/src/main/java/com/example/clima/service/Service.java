package com.example.clima.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo(){
        String dadosMeteorologicos = "";
        String apiURL = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=971020c20ea12f60e7807f7d3ff7a7da";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosMeteorologicos = responseEntity.getBody();
        }else {
            dadosMeteorologicos = "Falha ao obter dados meteorológicos. Código de status: " + responseEntity.getStatusCode();
        }

        return dadosMeteorologicos;
    }

}
