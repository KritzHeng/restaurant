package com.example.demo.service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public Restaurant create(Restaurant restaurant) {
        repository.save(restaurant);
        return restaurant;
    }
    public Restaurant getRestaurant(UUID id) {
        return repository.findById(id).get();
    }
    public Restaurant update(UUID id, Restaurant requestBody) {
        Restaurant record = repository.findById(id).get();
            record.setName(requestBody.getName());
            record.setAddress(requestBody.getAddress());
            record.setPhone(requestBody.getPhone());
            record.setNumSeats(requestBody.getNumSeats());
            record.setPriceRange(requestBody.getPriceRange());

        Restaurant r = repository.save(record);

        return r;
    }
    public Restaurant delete(UUID id) {
        Restaurant record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }




}
