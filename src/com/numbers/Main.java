// Java program to find numbers dividable by 3

package com.numbers;

import java.util.Set;
import java.util.TreeSet;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating TreeSet to store sorted list
        Set<Integer> set = new TreeSet<>();

        // Adding elements to a set
        for (int index = 0; index < 1000; index++) {

            set.add(index);

        }

        // Checking if elements of the set are dividable by 3
        for (int index = 0; index < 1000; index++) {

            // Helping variable to store current variable
            int number = index;

            // Condition
            if (number % 3 == 0) {

                // Printing the result to console
                System.out.println(number + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(number + " is not dividable by 3.");

            }
        }
    }
}