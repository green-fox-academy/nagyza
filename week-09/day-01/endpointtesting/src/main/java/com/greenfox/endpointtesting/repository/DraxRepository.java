package com.greenfox.endpointtesting.repository;

import com.greenfox.endpointtesting.services.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DraxRepository extends CrudRepository<Food, Long> {
}
