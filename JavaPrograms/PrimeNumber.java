//Write a Java program that prompts the user for an integer and displays all prime
numbers up to that integer. 

import java.util.Scanner;

public class PrimeNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the no:");
int n = scanner.nextInt();
for(int i= 2; i<=n;i++){
Boolean isPrime = true;
for(int j = 2; j*j <=i; j++){
if (i%j == 0){
isPrime= false;
break; 
}
}
if (isPrime){
System.out.println(i);
}
}
}
}