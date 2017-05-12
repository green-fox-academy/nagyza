package com.greenfoxacademy.redditclonejava.model;

public class Posts {

  Iterable<Post> posts;

  public Posts() {
  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
