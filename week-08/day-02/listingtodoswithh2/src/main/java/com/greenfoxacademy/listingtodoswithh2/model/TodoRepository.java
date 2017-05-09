package com.greenfoxacademy.listingtodoswithh2.model;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
