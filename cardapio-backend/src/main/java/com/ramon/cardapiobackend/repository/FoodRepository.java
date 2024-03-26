package com.ramon.cardapiobackend.repository;

import com.ramon.cardapiobackend.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
