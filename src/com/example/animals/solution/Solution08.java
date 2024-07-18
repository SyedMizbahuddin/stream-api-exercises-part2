package com.example.animals.solution;

import java.util.List;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

public class Solution08 {

	public static void main(String[] args) {

		List<Animal> animals = List.of(new Spider(), new Cat(), new Fish("Free Willy"), new Cat("Tekir"), new Fish(
				"Jaws"),
				new Spider());

		List<String> result = animals.stream()
				.map(a -> a.getClass().getSimpleName()).distinct()
				.toList();

		System.out.println(result);
	}
}
