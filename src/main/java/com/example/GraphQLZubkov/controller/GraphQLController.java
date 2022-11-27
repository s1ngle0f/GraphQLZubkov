package com.example.GraphQLZubkov.controller;

import com.example.GraphQLZubkov.model.Car;
import com.example.GraphQLZubkov.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController
{
    @Autowired
    CarRepository carRepository;

    @QueryMapping
    public List<Car> cars(){
        return carRepository.findAll();
    }
}
