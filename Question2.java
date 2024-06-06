package task12;

import java.util.ArrayList;

public class Question2 {
        public static void main(String[] args) {
            // Create an ArrayList of strings
            ArrayList<String> stringList = new ArrayList<>();

            // Add some elements to the ArrayList
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("This");
            stringList.add("Is");
            stringList.add("Java");

            // Print the ArrayList before removing elements
            System.out.println("ArrayList before removing elements: " + stringList);

            // Remove all elements from the ArrayList
            stringList.clear();

            // Print the ArrayList after removing elements
            System.out.println("ArrayList after removing elements: " + stringList);
        }
    }
