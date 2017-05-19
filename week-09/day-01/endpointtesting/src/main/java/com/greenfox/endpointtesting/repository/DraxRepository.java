package com.greenfox.endpointtesting.repository;

import com.greenfox.endpointtesting.services.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DraxRepository extends CrudRepository<Food, Long> {
  List<Food> findByName(String name);

  List<Food> queryFoodByAmountGreaterThan(int amount);

  List<Food> queryFoodByAmountLessThan(int amount);

  List<Food> queryFoodByAmountEquals(int amount);
}
