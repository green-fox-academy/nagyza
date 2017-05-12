package com.greenfoxacademy.redditclonejava.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Posts {

  List<Post> posts;

  public Posts() {
    this.posts = new ArrayList<>();
  }

  public void addPost(Post post) {
    this.posts.add(post);
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }
}
