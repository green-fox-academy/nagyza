package com.greenfoxacademy.redditclonejava.controllers;

import com.greenfoxacademy.redditclonejava.model.Posts;
import com.greenfoxacademy.redditclonejava.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  PostRepository postRepository;

  Posts posts = new Posts();

  @GetMapping("/posts")
  public Posts getPost() {
    posts.setPosts(postRepository.findAll());
    return posts;
  }
}
