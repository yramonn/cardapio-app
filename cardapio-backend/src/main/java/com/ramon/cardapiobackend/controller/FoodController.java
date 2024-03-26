package com.ramon.cardapiobackend.controller;

import com.ramon.cardapiobackend.dto.FoodRequestDto;
import com.ramon.cardapiobackend.dto.FoodResponseDto;
import com.ramon.cardapiobackend.model.Food;
import com.ramon.cardapiobackend.repository.FoodRepository;
import com.ramon.cardapiobackend.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodService service;
    @Autowired
    private FoodRepository repository;

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void saveFood(@RequestBody FoodRequestDto data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<FoodResponseDto> getAll() {

         List<FoodResponseDto> foodList = service.getAll().toList();
         return foodList;
    }
}
