package com.ramon.cardapiobackend.service;

import com.ramon.cardapiobackend.dto.FoodResponseDto;
import com.ramon.cardapiobackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class FoodService {
    @Autowired
    FoodRepository repository;    public Stream<FoodResponseDto> getAll() {

        return repository.findAll().stream().map(FoodResponseDto::new);
    }
}
