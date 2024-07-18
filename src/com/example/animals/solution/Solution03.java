package com.example.animals.solution;

import java.util.List;
import java.util.Optional;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

public class Solution03 {

	public static void main(String[] args) {

		List<Animal> animals = List.of(new Spider(), new Cat(), new Fish("Free Willy"), new Cat("Tekir"), new Fish(
				"Jaws"),
				new Spider());

		// Take a list of wild animals

		Optional<Object> result = animals.stream()
				.max((a, b) -> a.getLegs() - b.getLegs())
				.map(a -> a.getClass().getSimpleName());

		System.out.println(result);

	}
}
