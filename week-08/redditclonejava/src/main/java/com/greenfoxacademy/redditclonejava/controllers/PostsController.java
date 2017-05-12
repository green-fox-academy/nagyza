package com.greenfoxacademy.redditclonejava.controllers;

import com.greenfoxacademy.redditclonejava.model.Post;
import com.greenfoxacademy.redditclonejava.repsitory.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping("/")
  public void addPost() {
    postRepository.save(new Post("trial"));
    System.out.println("HAHA");
  }
}
