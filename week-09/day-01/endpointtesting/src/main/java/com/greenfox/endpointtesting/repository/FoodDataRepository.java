package com.greenfox.endpointtesting.repository;

import com.greenfox.endpointtesting.services.FoodData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodDataRepository extends CrudRepository<FoodData, Long> {
}
