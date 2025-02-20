package com.lugares.legais.repository;

import com.lugares.legais.domain.model.PlaceIndication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PlaceIndicationRepository extends JpaRepository<PlaceIndication, Long> {

    Optional<PlaceIndication> findByNamePlace(String namePlace);
    boolean existsByNamePlace(String login);

}
