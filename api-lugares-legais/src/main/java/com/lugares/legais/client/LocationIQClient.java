package com.lugares.legais.client;

import org.springframework.web.client.RestTemplate;
import com.lugares.legais.domain.dto.LocationIQResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LocationIQClient {

    private final RestTemplate restTemplate;

    @Value("${locationiq.api.key}")
    private String apiKey;

    @Value("${locationiq.base.url}")
    private String BASE_URL;

    public LocationIQResponseDTO[] searchAddress(String place) {
        String url = BASE_URL + "?key=" + apiKey + "&q=" + place.replace(" ", "+") + "&format=json";
        
        return restTemplate.getForObject(url, LocationIQResponseDTO[].class);
    }

}

