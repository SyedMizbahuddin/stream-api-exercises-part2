package com.example.animals.solution;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

public class Solution04 {

	public static void main(String[] args) {

		List<Animal> animals = List.of(new Spider(), new Cat(), new Fish("Free Willy"), new Cat("Tekir"), new Fish(
				"Jaws"),
				new Spider());
		Random random = new Random();

		List<String> result = Stream
				.iterate(1, x -> x < 100, (x) -> (x + 1))
				.map(x -> animals.get(random.nextInt(5)))
				.map(animal -> animal.getClass().getSimpleName())
				.collect(Collectors.toList());

		System.out.print(result);

	}
}
