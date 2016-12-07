package com.rsgtrijks.student.examples;

public class FunctionsAndClassesExample {

    // This function allows whatever is inside to be started as an application
    public static void main(String[] args) {


        // Remember, any public static void main(String[] args) results
        // into something that can be started as an application.
        // That means that the part within this scope ( { } ) is executed when you run this file.

        // Further below, we declared a class named Tutorial.
        // Here we make an "object" or "instance" of Tutorial to start some other examples.
        // This is done by using the "new" keyword because we want a new object of the type Tutorial.
        // there are () parenthesis after the type Tutorial because we call a creation function on that class.
        // We call this creation function a "constructor".
        // In this case we use a constructor function that is created by default. It has no parameters.
        Tutorial tutorial = new Tutorial();

        // A class can contain functions. If you look at the Tutorial class, you see that it
        // Has a function named explainPersons. We call this function on the instance of the class.
        // We named the instance tutorial.
        System.out.println("----------------------");
        System.out.println("Explaining persons");
        System.out.println("----------------------");
        tutorial.explainPersons();

        // We do the same for the calculator explanation.
        System.out.println("----------------------");
        System.out.println("Explaining calculator");
        System.out.println("----------------------");
        tutorial.explainCalculator();
    }
}

/*
 This declares a class named Tutorial.
 A class can contain variables and functions.
 Usually a class represents something that explains what it does or what it can be used for.
 In this example it is a Tutorial that is able to start some examples.
 */
class Tutorial {

    void explainPersons() {
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

    public void explainCalculator() {
        Calculator calculator = new Calculator();


        int result = calculator.sum(42, 6);
        System.out.println("42 summed with 6 is " + result);

        result = calculator.divide(9, 3);
        System.out.println("9 divided by 3 is " + result);

        result = calculator.multiply(2, 4);
        System.out.println("2 multiplied by 4 is " + result);

        result = calculator.subtract(2, 4);
        System.out.println("2 subtracted by 4 is " + result);

        result = calculator.highest(3, 6);
        System.out.println("3 and 6, which is higher? " + result);

        result = calculator.highest(6, 3);
        System.out.println("6 and 3, which is higher? " + result);
    }
}

/*
 This declares a class named Person.
 A class can contain variables and functions.
 Usually a class represents something that explains what it does or what it can be used for.
 In this example it is a class that represents a "Person". A person has a name, can say hello and introduce.
 */
class Person {

    // In a class we can declare variables for the whole scope of the class, whatever is between {} brackets)
    // From class Person { to the end bracket. We call these "fields".
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

    int subtract(int first, int second) {
        return first - second;
    }

    int multiply(int first, int second) {
        return first * second;
    }

    int divide(int first, int second) {
        return first / second;
    }

    int highest(int first, int second) {
        int highest = first;
        if (second > first) {
            highest = second;
        }
        return highest;
    }
}
