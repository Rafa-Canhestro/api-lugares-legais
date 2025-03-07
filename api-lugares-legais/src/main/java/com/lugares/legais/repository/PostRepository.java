package com.lugares.legais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import org.springframework.stereotype.Repository;

import com.lugares.legais.domain.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

    List<Post> findByTitle(String title); // Get posts by title
    Optional<Post> findById(Long id); // Get post by ID
    boolean existsByTitle(String title); // Check if title exists

}
