package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	private static final String length2 = null;
	private static final String length1 = null;
	public static void main(String[] args) {
		System.out.println("--Welcome to Line Comparison Computation Program--\n");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the coordinates for point p1 (x1,y1): ");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();

		System.out.print("Enter the coordinates for point p2 (x2, y2): ");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();

		System.out.println();
		System.out.print("Enter the coordinates for point p2 (x3, y3): ");
		float x3 = sc.nextFloat();
		float y3 = sc.nextFloat();
		
		System.out.print("Enter the coordinates for point p2 (x4, y4): ");
		float x4 = sc.nextFloat();
		float y4 = sc.nextFloat();
		System.out.println();
		
		double length1 = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("length of first line is: " + length1);
        
        Double length2 = Math.sqrt((Math.pow((x4-x3),2))+(Math.pow((y4-y3),2)));
        System.out.println("length of second line is: " + length2);
        
        checkLineEquality(length1 , length2);
        compareTwoLines(length1, length2);
		}
        
        static void checkLineEquality(Double length1, Double length2) {
            boolean result = length2.equals(length1);
            if (result){
                System.out.println("Lines are equal");
            }
            else{
                System.out.println("Lines are not equal");
            }
        }
        static void compareTwoLines(Double length1, Double length2) {
            int result = length2.compareTo(length1);
            if (result == 0){
                System.out.println("Two lines are equal");
            } else if (result > 0) {
                System.out.println("Line 2 is greater than line 1");
            }
            else {
                System.out.println("line 1 is greater than line 2");
            }
	}
}
