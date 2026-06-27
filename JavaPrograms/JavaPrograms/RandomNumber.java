AIM:
Generate random numbers between two given limits using Random class and print messages
according to the value range generated.

import java.util.Random;

import java.util.Scanner;

public class RandomNumber {

 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

 Random random = new Random();

 System.out.print("Enter the lower limit: ");

int lowerLimit = scanner.nextInt();

 System.out.print("Enter the upper limit: ");

 int upperLimit = scanner.nextInt();

 int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

 System.out.println("Generated Random Number: " + randomNumber);

 if (randomNumber < 0) {

 System.out.println("The number is negative.");

 } else if (randomNumber >= 0 && randomNumber <= 10) {

 System.out.println("The number is between 0 and 10.");

 } else if (randomNumber > 10 && randomNumber <= 50) {

 System.out.println("The number is between 11 and 50.");

 } else 

{

 System.out.println("The number is greater than 50");

}

}

}

