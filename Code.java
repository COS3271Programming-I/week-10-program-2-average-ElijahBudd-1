package myProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
	
	// Calculates the average for the list of integers
	public static double calculateAverage(List<Integer> list) {
		double sum = 0;
		for (int value : list) {
			sum += value;
		}
		return sum / list.size();
	}
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println("Enter integers Up to a max of 30 (type 'done' to finish)");
		
		// While loop to not let list exceed 30
		while (numbers.size() < 30) {
			System.out.print("Enter integer " + (numbers.size() + 1) + ": ");
			// Checks if the next character is an integer
			if (userinput.hasNextInt()) {
				numbers.add(userinput.nextInt());
			} else {
				break; // Stops if user entered text
			}
		}
		
		// Only calculates if the user gave at least one integer
		if (!numbers.isEmpty()) {
			double avg = calculateAverage(numbers);
			System.out.println("\nList" + numbers);
			System.out.printf("Average value: %.2f\n", avg);
        } else {
            System.out.println("No numbers entered.");
        }
        
        userinput.close();
	}
}
