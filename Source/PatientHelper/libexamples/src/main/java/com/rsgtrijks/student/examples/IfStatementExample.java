package com.example;

public class IfStatementExample {
    public static void main(String[] args) {
        System.out.println("Start");

        int number = 10; // represent a number 10.
        double realNumber = 9.5; // represent a real number 9.6.

        double op1 = realNumber / number + number;
        double op2 = realNumber / (number + number);
        System.out.println("Operation1: " + op1); // run this to see the result
        System.out.println("Operation2: " + op2); // run this to see the result

        if (op1 == op2) {
            System.out.println("brackets don't matter!"); // run this to see the result
        } else {
            System.out.println("brackets matter!"); // run this to see the result
        }

        boolean value = true; // true or false

        // simple if statement on a boolean variable. use '==' for equals
        if(value == true){
            System.out.println("It is true"); // run this to see the result
        }

        if(value == false){
            System.out.println("It is false"); // run this to see the result
        }

        //use '!=' for not equals
        if(value != false){
            System.out.println("It is not false"); // run this to see the result
        }

        // you can use comparison operators as well: >, <, >=, =<
        if(number > 8){
            System.out.println("number is larger than 8"); // run this to see the result

            if(number < 15){
                System.out.println("number is less than 15"); // run this to see the result
            }

            if(number < 10){
                System.out.println("number is less than 10"); // run this to see the result
            }
        }

        // you can combine multiple conditions in one with '&' operator, this operator also known as 'and operator'
        if(number > 5 & number < 15){
            System.out.println("number is more than 5 and less than 15 "); // run this to see the result
        }

        // you can combine multiple conditions in one with '|' operator, this operator also known as 'or operator'
        if(number < 2 | number > 5){
            System.out.println("number is either less than 2 or more than 5"); // run this to see the result
        }

        System.out.println("End");
    }
}
