package com.lugares.legais.domain.services.post;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.lugares.legais.repository.PostRepository;
import com.lugares.legais.domain.Entity.PlaceIndication;
import com.lugares.legais.domain.Entity.Post;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.helper.GetUserHelper;
import com.lugares.legais.domain.mapper.PostMapper;
import com.lugares.legais.domain.services.location.LocationService;
import com.lugares.legais.domain.services.post.helper.GetPlaceIndicationHelper;
import java.util.*;
import org.springframework.security.core.Authentication;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final GetUserHelper getUserHelper;
    private final GetPlaceIndicationHelper getPlaceIndicationHelper;
    private final LocationService locationService;
    private final PostMapper mapper;

    public Post createPost(PostDTO postInformation) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = getUserHelper.get(username);
        Optional<PlaceIndication> optionalPlace = getPlaceIndicationHelper.get(postInformation.getNamePlace());
        Post post = mapPost(optionalPlace, postInformation, user);
        savePost(post);
        
        return post;
    } 

    private Post mapPost(Optional<PlaceIndication> optionalPlace, PostDTO postInformation, User user) {
        if (optionalPlace.isEmpty()) {
            String addressPlace = locationService.getLocationFromClient(postInformation.getNamePlace());
            PlaceIndication placeIndication = buildPlaceIndication(addressPlace, postInformation);
            return mapper.postDtoToPost(postInformation, user, placeIndication);
        } else {
            PlaceIndication placeIndication = optionalPlace.get();
            return mapper.postDtoToPost(postInformation, user, placeIndication);
        }
    }

    private PlaceIndication buildPlaceIndication(String addressPlace, PostDTO postInformation) {
        PlaceIndication placeIndication = PlaceIndication.builder()
            .placeName(postInformation.getNamePlace())
            .address(addressPlace)
            .typeOfPlace(postInformation.getTypeOfPlace())
            .build();

        return placeIndication;
    }

    private void savePost(Post post) {
        postRepository.save(post);
    }

}
