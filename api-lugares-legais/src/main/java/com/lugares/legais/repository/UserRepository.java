package com.lugares.legais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugares.legais.domain.Entity.User;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Validar se o formato do ID pode ser outro. Neste caso está como long,
    //mas usuários serão pesquisados por login, ou seja, string

    Optional<User> findByLogin(String login);
    boolean existsByLogin(String login);

}
