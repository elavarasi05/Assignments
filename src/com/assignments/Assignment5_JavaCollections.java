package com.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Assignment5_JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Create a list of the top 5 most populated countries in the world and print 2
		List<String> populatedCountries = new ArrayList<String>();
		populatedCountries.add("China");
		populatedCountries.add("India");		
		populatedCountries.add("United States");
		populatedCountries.add("Pakisthan");
		populatedCountries.add("Indonesia");
		
		System.out.println("Second most populated country in the world: " +populatedCountries.get(1));
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
        Set<String> touristAttractions = new HashSet<String>(Arrays.asList("France","Swiz","Amsterdam","United states","United Kingdom","UAE","Singapore","Malayasia","Thailand","China"));
		System.out.println("Size of tourist attraction set: " +touristAttractions.size());
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		
		Map<String, Integer> cityAndPopulation = new HashMap<String, Integer>();
		cityAndPopulation.put("New York city", 841960);
		cityAndPopulation.put("Los Angeles", 3980400);
		cityAndPopulation.put("Chicago", 2716000);
		cityAndPopulation.put("Houston", 2328000);
		cityAndPopulation.put("Phoenix", 1690000);
		
		System.out.println("Top 5 largest populated cities are " +cityAndPopulation);
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100); // Generating random numbers between 0-99
        }

        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));
		System.out.println("Sum of 3rd and 5th Value: " + (randomNumbers[2] + randomNumbers[4]));
	
		
		//5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> highGrossMovies = new ArrayList<String>(Arrays.asList("Avatar", "Avengers","Titanic","Star wars","Harry potter"));
		System.out.println("The third highest grossing movie is " +highGrossMovies.get(2));
		
	}
	

}
