package week7again;

import java.util.Scanner;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
    //Scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number = scanner.nextInt();
    isItOddOrEvenNumber(number);
    //closing the scanner object
     scanner.close();
    }

    // Checking if the number is even or odd
    public static void isItOddOrEvenNumber(int number){
    //Using ternary operator
    String evenOrOdd =(number % 2 == 0)  ? "Even" : "Odd";
    System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
