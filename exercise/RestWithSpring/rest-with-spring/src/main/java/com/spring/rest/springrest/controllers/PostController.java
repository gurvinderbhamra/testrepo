package com.spring.rest.springrest.controllers;

import com.spring.rest.springrest.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    RestTemplate restTemplate;

    private String url="https://jsonplaceholder.typicode.com/posts/";

    @GetMapping("/post/{id}")
    public String getPost(@PathVariable Long id){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url + id, String.class);
        System.out.println(responseEntity.getStatusCode().toString());
        System.out.println(responseEntity.getHeaders().toString());
        return responseEntity.getBody();
    }

    @GetMapping("/postList")
    public List<Post> getPostList(){
        ResponseEntity<List<Post>> response = restTemplate
                .exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Post>>(){});
        return response.getBody();
    }

    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(new Post(10000L, 10000L, "title1", "description"), httpHeaders);
        Post post = restTemplate.postForObject(url, request, Post.class);
        System.out.println(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }

    @PutMapping("/post")
    public ResponseEntity<Post> updatePost(){
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(1L,1L,"update title","update description"),httpHeaders);
        return restTemplate.exchange(url,HttpMethod.PUT,request,Post.class);
    }

    @DeleteMapping("/deletePost")
    public void deletePost(){
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url,HttpMethod.DELETE,request,Post.class);
    }
}
