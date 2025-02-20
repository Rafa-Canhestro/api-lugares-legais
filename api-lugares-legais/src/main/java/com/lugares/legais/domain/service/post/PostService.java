package com.lugares.legais.domain.service.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.lugares.legais.repository.PostRepository;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.service.validation.GetUser;
import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.mapper.PostMapperImpl;
import com.lugares.legais.domain.model.User;
import com.lugares.legais.domain.model.PlaceIndication;
import java.util.*;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final GetUser getUser;
    private final GetPlaceIndication getPlaceIndication;
    private final PostMapperImpl mapper;

    public Post createPost(PostDTO postInformation) {
        User user = getUser.get(postInformation.getLogin());

        //antes de mapear post, verificar se as informações foram inseridas pelo user corretamente,
        //por meio de classes de validação

        Post post = mapper.PostDtoToPost(postInformation, user);
        Optional<PlaceIndication> optionalPlace = getPlaceIndication.get(postInformation.getNamePlace());

        if (optionalPlace.isEmpty()) {
            //lógica para criar um PlaceIndication. Pensar em chamar um client para pegar as informações de
            //um lugar existente.
        }

        PlaceIndication placeIndication = optionalPlace.get();

        savePost(post);
        
        return post;
    }

    private void savePost(Post post) {
        postRepository.save(post);
    }

}
