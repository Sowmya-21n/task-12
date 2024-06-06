package task12;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
        public static void main(String[] args) {
            // Create a List and add some elements
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Convert the List to an Array
            String[] array = list.toArray(new String[0]);

            // Print the array to verify the conversion
            for (String element : array) {
                System.out.println(element);
            }
        }
    }

