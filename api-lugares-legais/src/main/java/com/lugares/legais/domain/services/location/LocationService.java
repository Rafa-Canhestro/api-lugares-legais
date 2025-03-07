package com.lugares.legais.domain.services.location;

import org.springframework.stereotype.Service;
import com.lugares.legais.client.LocationIQClient;
import com.lugares.legais.domain.dto.LocationIQResponseDTO;
import com.lugares.legais.domain.exceptions.PlaceIndicationNotExistsException;

import lombok.RequiredArgsConstructor;
import java.util.*;

@Service
@RequiredArgsConstructor
public class LocationService {

    private final LocationIQClient locationIQClient;

    public String getLocationFromClient(String place) {
        LocationIQResponseDTO[] results = locationIQClient.searchAddress(place);

        LocationIQResponseDTO location = getLocation(results);

        return location.getAddress();
    }

    private LocationIQResponseDTO getLocation(LocationIQResponseDTO[] results) {
        LocationIQResponseDTO location = Arrays.stream(Optional.ofNullable(results)
        .orElse(new LocationIQResponseDTO[0]))
        .findFirst()
        .orElseThrow(() -> new PlaceIndicationNotExistsException());

        return location;
    }
}
