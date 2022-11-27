package com.example.GraphQLZubkov;

import com.example.GraphQLZubkov.model.Car;
import com.example.GraphQLZubkov.repo.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GraphQlZubkovApplicationTests {

	@Autowired
	CarRepository carRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void addNewCar(){
		Car car = new Car(2l, "BMW", "M4", "28-02-2003");
		carRepository.saveAndFlush(car);
	}

	@Test
	void getAllCars(){
		System.out.println(carRepository.findAll());
	}

}
