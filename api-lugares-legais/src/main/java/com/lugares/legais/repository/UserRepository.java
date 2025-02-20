package com.lugares.legais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.lugares.legais.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Validar se o formato do ID pode ser outro. Neste caso está como long,
    //mas usuários serão pesquisados por login, ou seja, string

    Optional<User> findByLogin(String login);
    boolean existsByLogin(String login);

}
