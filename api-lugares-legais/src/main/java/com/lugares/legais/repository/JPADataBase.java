package com.lugares.legais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lugares.legais.domain.model.Post;

@Repository
public interface JPADataBase extends JpaRepository<Post, Long>{

}
