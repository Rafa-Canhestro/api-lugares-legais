package com.lugares.legais.client;

import com.lugares.legais.client.exceptions.LocationIQException;
import com.lugares.legais.domain.dto.LocationIQResponseDTO;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class LocationIQClient {

    private final WebClient.Builder webClientBuilder;

    @Value("${locationiq.api.key}")
    private String apiKey;

    @Value("${locationiq.base.url}")
    private String BASE_URL;

    public LocationIQResponseDTO[] searchAddress(String place) {
        String url = getUrlApiLocation(place);

        return callApiLocation(url);
    }

    private String getUrlApiLocation(String place) {
        String url = BASE_URL + "?key=" + apiKey + "&q=" + place.replace(" ", "+") + "&format=json";
        return url;
    }    

    private LocationIQResponseDTO[] callApiLocation(String url) {
        return webClientBuilder.build()
        .get()
        .uri(url)
        .exchangeToMono(response -> {
            if (response.statusCode().is2xxSuccessful()) {
                return response.bodyToMono(LocationIQResponseDTO[].class);
            } else {
                return Mono.<LocationIQResponseDTO[]>error(
                    new LocationIQException("code error: " + response.statusCode())
                );
            }
        })
        .block();
    }

}

