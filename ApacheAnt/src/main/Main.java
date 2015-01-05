package main;

import math.MyMath;

public class Main {
	/*
	 * BUILDTOOL: used to automate repetitive tasks
	 * 	- Often run headless from the command line
	 * 	- Apache Ant, Maven and Gradle
	 * 
	 * Apache Ant: Another Neat Tool
	 * 	- build.xml file
	 *  	- tasks: small atomic tasks that should be performed
	 *  	- targets: directly invoked by Ant, have dependencies
	 *  	- extension points
	 */
	public static void main(String[] args) {
		MyMath math = new MyMath();
		System.out.println("Result is: " + math.multi(5, 10));
	}
}
