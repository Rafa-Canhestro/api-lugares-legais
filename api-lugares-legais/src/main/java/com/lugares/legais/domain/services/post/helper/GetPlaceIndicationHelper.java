package com.lugares.legais.domain.services.post.helper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.domain.Entity.PlaceIndication;
import com.lugares.legais.repository.PlaceIndicationRepository;
import java.util.*;

@Component
@RequiredArgsConstructor
public class GetPlaceIndicationHelper {

    private final PlaceIndicationRepository repository;

    public Optional<PlaceIndication> get(String placeName) {
        return repository.findByPlaceName(placeName);
    }

}
