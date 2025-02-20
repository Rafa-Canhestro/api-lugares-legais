package com.lugares.legais.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.service.postserviceflow.PostService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/postIndication")
@RequiredArgsConstructor
public class ControllerPost {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostDTO post) {
        Post createdPost = postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
    }

    @GetMapping
    public ResponseEntity<Post> getPost() {
        Post post = new Post();
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(@RequestParam String placeName) {
        List<Post> posts = new ArrayList<>();
        return posts;
    }

}
