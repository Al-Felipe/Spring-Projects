package com.example.activity.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Service {
    public String getActivity(){
        String activity = "";
        String apiURL = "https://www.boredapi.com/api/activity";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            activity = responseEntity.getBody();
        } else {
            activity = "Falha ao obter dados. Código de status " + responseEntity.getStatusCode();
        }

        return activity;
    }
}
