package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Restaurant;

import java.util.UUID;

@Repository
public interface RestaurantRepository extends
        JpaRepository<Restaurant, UUID> {
}
