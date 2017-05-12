package com.greenfoxacademy.redditclonejava.repsitory;

import com.greenfoxacademy.redditclonejava.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends CrudRepository<Post, Long> {
}
