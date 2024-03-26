package com.ramon.cardapiobackend.dto;

import com.ramon.cardapiobackend.model.Food;

public record FoodResponseDto(Long id, String title, String image, Integer price  ){
    public FoodResponseDto( Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
