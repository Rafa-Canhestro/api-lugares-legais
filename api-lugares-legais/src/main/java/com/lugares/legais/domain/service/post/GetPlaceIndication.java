package com.lugares.legais.domain.service.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.repository.PlaceIndicationRepository;
import java.util.*;
import com.lugares.legais.domain.model.PlaceIndication;

@Component
@RequiredArgsConstructor
public class GetPlaceIndication {

    private final PlaceIndicationRepository repository;

    public Optional<PlaceIndication> execute(String placeName) {
        return repository.findByPlaceName(placeName);
    }

}
