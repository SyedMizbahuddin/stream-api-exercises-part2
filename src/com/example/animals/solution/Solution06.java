package com.example.animals.solution;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

public class Solution06 {

	public static void main(String[] args) {

		List<Animal> animals = List.of(new Spider(), new Cat(), new Fish("Free Willy"), new Cat("Tekir"), new Fish(
				"Jaws"),
				new Spider());

		Map<Object, List<Object>> result = animals.stream()
				.collect(Collectors.groupingBy(a -> a.getLegs(),
						Collectors.mapping(a -> a.getClass()
								.getSimpleName(),
								Collectors.toList())));

		System.out.println(result);
	}
}
