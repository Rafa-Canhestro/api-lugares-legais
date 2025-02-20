package com.lugares.legais.domain.service.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.lugares.legais.repository.PostRepository;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.service.validation.ValidateUserLogin;
import com.lugares.legais.domain.dto.PostDTO;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final ValidateUserLogin validateUserLogin;

    public Post createPost(PostDTO postInformation) {
        Post post = new Post();
        validateUserLogin.validate(postInformation.getLogin());
        //Validar a existência do local. Caso não tenha, permitir inserção de novo
        //Validar dados do post antes de criar
        savePost(post);
        
        return post;
    }

    private void savePost(Post post) {
        postRepository.save(post);
    }

}
