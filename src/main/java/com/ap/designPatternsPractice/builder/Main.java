package com.ap.designPatternsPractice.builder;

/**
 * Created by APandey on 03-04-2017.
 */
//Creational Pattern
public class Main {
//Problems it solves
//1) Need not to maintain too many constructors.
//2) If the object is heavy and its creation is complex then that could be simplified.


/*
Advantages:
1) more maintainable if number of fields required to create object is more than 4 or 5.
2) less error-prone as user will know what they are passing because of explicit method call.
3) more robust as only fully constructed object will be available to client.

Disadvantages:
1) verbose and code duplication as Builder needs to copy all fields from Original or Item class.
 */
//Imp points about this class
//User constructor is private so that class can't be instantiated directly by client
//Class is immutable as all attributes are final and they are set on the constructor.
//We only provide getters for them
	public static void main(String[] args) {
		System.out.println(new User.UserBuilder("Arpit", "Pandey").age(28).phone("12311").build());
	}
}
