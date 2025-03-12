package com.lugares.legais.client;

import com.lugares.legais.client.exceptions.LocationIQException;
import com.lugares.legais.domain.dto.LocationIQResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Component
@RequiredArgsConstructor
public class LocationIQClient {

    private final RestTemplate restTemplate;

    @Value("${locationiq.api.key}")
    private String apiKey;

    @Value("${locationiq.base.url}")
    private String BASE_URL;

    public LocationIQResponseDTO[] searchAddress(String place) {
        String url = getUrlApiLocation(place);

        return callApiLocation(url);
    }

    private String getUrlApiLocation(String place) {
        return BASE_URL + "?key=" + apiKey + "&q=" + place.replace(" ", "+") + "&format=json";
    }

    private LocationIQResponseDTO[] callApiLocation(String url) {
        try {
            ResponseEntity<LocationIQResponseDTO[]> response = restTemplate.getForEntity(url, LocationIQResponseDTO[].class);
            
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                throw new LocationIQException("Error: " + response.getStatusCode());
            }

        } catch (Exception e) {
            throw new LocationIQException();
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
