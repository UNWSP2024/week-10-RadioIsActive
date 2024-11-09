package src.JavaWeek10Programs;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListAverage {
    static Scanner userinput = new Scanner(System.in);
    static double calculateAverage (List<Integer> numbers){
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.size();
    } 
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter integers for a list (up to 30). Type 'x' to finish: ");

        while (numbers.size() < 30) {
            System.out.print("Enter an integer (or 'x' to finish): ");
            String input = userinput.nextLine();
            
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        double average = calculateAverage(numbers);
        long roundedAverage = Math.round(average);
        System.out.println("The average (rounded) is: " + roundedAverage);
        
        userinput.close();
    }
}
