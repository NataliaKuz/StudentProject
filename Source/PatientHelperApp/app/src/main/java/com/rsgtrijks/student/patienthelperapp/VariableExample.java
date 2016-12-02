package com.rsgtrijks.student.patienthelperapp;

public class VariableExample {

    public static void main(String[] args) {
        System.out.println("Start");

        // create different variables. Each variable is Java must start with a type

        int number = 10; // represent a number 10. Use key word 'int' to represent integer numbers
        double realNumber = 9.5; // represent a real number 9.6. Use key word 'double' to represent realNumber
        String text = "This is example text"; // represent specified text. Use key word 'String' to represent text
        boolean value = true; // boolean is a type that can take only 2 value: true or false

        System.out.println("Number: " + number); // this will print 'Number: 10'

        double sum = number + realNumber; // you have to choose 'double' as a type for sum as the result of the operation is a real number
        System.out.println("Sum: " + sum); // this will print 'Sum: 19.5'

        double dif = realNumber - number;
        System.out.println("Difference: " + dif); // this will print 'Difference: -0.5'

        double mult = realNumber * number;
        System.out.println("Multiplication: " + mult); // run this to see the result

        double div = realNumber / number;
        System.out.println("Division: " + div); // run this to see the result

        double op1 = realNumber / number + number;
        double op2 = realNumber / (number + number);
        System.out.println("Operation1: " + op1); // run this to see the result
        System.out.println("Operation2: " + op2); // run this to see the result

        if (op1 == op2) {
            System.out.println("brackets don't matter!"); // run this to see the result
        } else {
            System.out.println("brackets matter!"); // run this to see the result
        }

        System.out.println("End");
    }
}
