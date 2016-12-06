package com.example;

public class LoopsExample {

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("");
        System.out.println("While loop start");

        // A while loop does something until a condition results in being true. so in this case
        // as long as variable whileIterator is smaller than the number 3

        int whileIterator = 0; // declare an integer number with a start value of 0
        while (whileIterator < 3) {
            whileIterator++; // Add 1 to the whileIterator variable

            // whileIterator += 1   This is another way of writing the addition, it does the same as the line above
            // whileIterator = i + 1 This is another way of writing the addition, it does the same as the line above

            // Because of the while loop, this part between the {} brackets will be performed 3 times
            System.out.println("While loop run #" + whileIterator);
        }

        System.out.println("While loop end");
        System.out.println("");
        System.out.println("For loop start");

        // A for loop has three parts separated by a ;.
        // 1. "int forIterator = 0" declares a variable with an initial value.
        // 2.  "forIterator < 5" has a condition, as long as this condition is true, the loop will continue.
        // 3.  "forIterator++" is the action that will be performed at the end of each loop run.
        // In this case we add 1 to the variable forIterator.
        for (int forIterator = 0; forIterator < 5; forIterator++) {
            // Because of the for loop, this part between the {} brackets will be performed 5 times

            // We up the number by 1 so that it does not start at index 0.
            // The addition in the for loop declaration is performed at the end bracket }
            int runNumber = forIterator + 1;

            System.out.println("For loop run #" + runNumber);
        }

        System.out.println("For loop end");
        System.out.println("");
        System.out.println("Foreach loop start");

        // Declare an array (collection) of strings (text)
        String[] texts = new String[]{"a","b","c"};

        // Here we go over a collection type like the array of strings "texts",
        // the loop continues until the end of the collection
        for (String text : texts) {
            //We print all texts in the list
            System.out.println("Foreach run " + text);
        }

        System.out.println("Foreach loop end");
        System.out.println("");
        System.out.println("End");
    }
}
