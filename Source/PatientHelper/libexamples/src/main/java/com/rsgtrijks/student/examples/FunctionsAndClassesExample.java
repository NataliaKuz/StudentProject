package com.rsgtrijks.student.examples;

// This declares a class named Examples.
// A class can contain variables and functions.
// Usually a class represents something that explains what it does or what it can be used for.
// For example it could be a "Person" class that can say hello and has a name.
class Person {

    String name = "Unknown";

    public Person(String personName) {
        // This function has a parameter "(String personName)" this is a variable that can be passed
        // into the function and can only be used inside the function.

        // We assign the person name to the variable name which can be accessed from the whole class.
        // This way we can use it in other functions later.
        name = personName;
    }

    // The part "void" stands for the type that the function results into or as we like to say: "returns".
    // void is a type that returns nothing, it is a function that executes some code but has no result.
    void sayHello() {
        System.out.println("Hello!");
    }

    void introduce() {
        // It is possible to execute or "call" other functions from a function in the same class
        sayHello();

        // It is possible to use variables that are declared within the same class.
        System.out.println("My name is " + name + ". Pleased to meet you.");
    }
}

class Calculator {
    int sum(int first, int second) {
        return first + second;
    }

    int substract(int first, int second) {
        return first - second;
    }

    int multiply(int first, int second) {
        return first * second;
    }

    int divide(int first, int second) {
        return first / second;
    }
}


public class FunctionsAndClassesExample {

    // This function allows whatever is inside to be started as an application
    public static void main(String[] args) {

        // We can create a variable of our own type: Person.
        System.out.println("Created a new person: Jean");
        Person jean = new Person("Jean");

        System.out.println("Person sayHello:");
        jean.sayHello();

        System.out.println("Person's name is: " + jean.name);

        System.out.println("Person introduces:");
        jean.introduce();

        System.out.println("");

        // We can have another variable of the type Person. We call this an "instance".
        // We can create a variable of our own type: Person.
        System.out.println("Created a new person: Natalia");
        Person natalia = new Person("Natalia");

        System.out.println("Person sayHello:");
        natalia.sayHello();

        System.out.println("Person's name is: " + natalia.name);

        System.out.println("Person introduces:");
        natalia.introduce();
    }
}