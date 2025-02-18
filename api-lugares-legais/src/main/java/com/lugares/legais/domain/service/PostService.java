package com.lugares.legais.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.lugares.legais.repository.JPADataBase;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.dto.PostDTO;

@Service
@RequiredArgsConstructor
public class PostService {

    private final JPADataBase dataBase;

    public Post createPost(PostDTO postInformations) {

        return new Post();
    }

}
