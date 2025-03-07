package com.lugares.legais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugares.legais.domain.Entity.PlaceIndication;

import java.util.*;

@Repository
public interface PlaceIndicationRepository extends JpaRepository<PlaceIndication, Long> {

    Optional<PlaceIndication> findByPlaceName(String placeName);
    boolean existsByPlaceName(String placeName);

}
