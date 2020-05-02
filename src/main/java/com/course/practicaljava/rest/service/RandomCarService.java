package com.course.practicaljava.rest.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.course.practicaljava.rest.domain.Car;
import com.course.practicaljava.util.RandomDateUtil;

@Service
public class RandomCarService implements CarService {

	private Random random = new Random();

	@Override
	public Car generateCar() {

		String randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
		String randomColor = COLORS.get(random.nextInt(COLORS.size()));
		String randomType = TYPES.get(random.nextInt(TYPES.size()));

		Car car = new Car(randomBrand, randomColor, randomType);

		car.setAvailable(random.nextBoolean());
		car.setPrice(5000 + random.nextInt(7001));
		car.setFirstReleaseDate(RandomDateUtil.generateRandomDate());

		return car;
	}

}
